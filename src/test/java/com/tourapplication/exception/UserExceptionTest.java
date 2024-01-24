package com.tourapplication.exception;

import static com.tourapplication.utils.MasterData.getUserDTO;
import static com.tourapplication.utils.TestUtils.currentTest;
import static com.tourapplication.utils.TestUtils.exceptionTestFile;
import static com.tourapplication.utils.TestUtils.testReport;
import static com.tourapplication.utils.TestUtils.yakshaAssert;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.tourapplication.controller.UserController;
import com.tourapplication.dto.UserDTO;
import com.tourapplication.service.UserService;
import com.tourapplication.utils.MasterData;

@WebMvcTest(UserController.class)
@AutoConfigureMockMvc
public class UserExceptionTest {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private UserService userService;

	@AfterAll
	public static void afterAll() {
		testReport();
	}

	@Test
	public void testCreateUserInvalidDataException() throws Exception {
		UserDTO userDTO = getUserDTO();
		userDTO.setName(null);

		RequestBuilder requestBuilder = MockMvcRequestBuilders.post("/api/users")
				.content(MasterData.asJsonString(userDTO)).contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON);

		MvcResult result = mockMvc.perform(requestBuilder).andReturn();

		yakshaAssert(currentTest(),
				(result.getResponse().getStatus() == HttpStatus.BAD_REQUEST.value() ? "true" : "false"),
				exceptionTestFile);
	}

	@Test
	public void testUpdateUserInvalidDataException() throws Exception {
		UserDTO userDTO = getUserDTO();
		userDTO.setName(null);

		RequestBuilder requestBuilder = MockMvcRequestBuilders.put("/api/users/" + userDTO.getId())
				.content(MasterData.asJsonString(userDTO)).contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON);

		MvcResult result = mockMvc.perform(requestBuilder).andReturn();

		yakshaAssert(currentTest(),
				(result.getResponse().getStatus() == HttpStatus.BAD_REQUEST.value() ? "true" : "false"),
				exceptionTestFile);
	}

	@Test
	public void testGetUserByIdNotFoundException() throws Exception {
		UserDTO userDTO = getUserDTO();

		when(this.userService.getUserById(userDTO.getId())).thenThrow(new NotFoundException("User not found"));
		RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/api/users/" + userDTO.getId())
				.contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON);

		MvcResult result = mockMvc.perform(requestBuilder).andReturn();

		yakshaAssert(currentTest(),
				(result.getResponse().getStatus() == HttpStatus.NOT_FOUND.value() ? "true" : "false"),
				exceptionTestFile);
	}

	@Test
	public void testDeleteUserByIdNotFoundException() throws Exception {
		UserDTO userDTO = getUserDTO();

		when(this.userService.deleteUserById(userDTO.getId())).thenThrow(new NotFoundException("User not found"));
		RequestBuilder requestBuilder = MockMvcRequestBuilders.delete("/api/users/" + userDTO.getId())
				.contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON);

		MvcResult result = mockMvc.perform(requestBuilder).andReturn();

		yakshaAssert(currentTest(),
				(result.getResponse().getStatus() == HttpStatus.NOT_FOUND.value() ? "true" : "false"),
				exceptionTestFile);
	}
}
