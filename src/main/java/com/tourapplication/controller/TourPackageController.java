package com.tourapplication.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tourapplication.service.TourPackageService;

@RestController
@RequestMapping("/api/packages")
public class TourPackageController {

	private final TourPackageService packageService = null;

}
