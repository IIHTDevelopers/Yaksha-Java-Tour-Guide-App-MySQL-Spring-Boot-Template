package com.tourapplication.service.impl;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.tourapplication.dto.TourPackageDTO;
import com.tourapplication.exception.NotFoundException;
import com.tourapplication.service.TourPackageService;

@Service
public class TourPackageServiceImpl implements TourPackageService {

	@Override
	public Page<TourPackageDTO> getAllPackages(Pageable pageable) {
		// write your logic here
		return null;
	}

	@Override
	public List<TourPackageDTO> getAllPackagesByNumberOfDays(int numberOfDays) {
		// write your logic here
		return null;
	}

	@Override
	public List<TourPackageDTO> getAllPackagesByUser(Long userId) {
		// write your logic here
		return null;
	}

	@Override
	public TourPackageDTO getPackageById(Long packageId) throws NotFoundException {
		// write your logic here
		return null;
	}

	@Override
	public TourPackageDTO createPackage(TourPackageDTO tourPackageDTO) {
		// write your logic here
		return null;
	}

	@Override
	public TourPackageDTO updatePackage(Long packageId, TourPackageDTO tourPackageDTO) throws NotFoundException {
		// write your logic here
		return null;
	}

	@Override
	public boolean deletePackageById(Long packageId) throws NotFoundException {
		// write your logic here
		return false;
	}
}
