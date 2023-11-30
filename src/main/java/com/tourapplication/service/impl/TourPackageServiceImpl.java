package com.tourapplication.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tourapplication.dto.TourPackageDTO;
import com.tourapplication.entity.TourPackage;
import com.tourapplication.repo.TourPackageRepository;
import com.tourapplication.service.TourPackageService;

import javassist.NotFoundException;

@Service
public class TourPackageServiceImpl implements TourPackageService {

	private final TourPackageRepository tourPackageRepository = null;

	@Override
	public List<TourPackageDTO> getAllPackages() {
		return null;
	}

	@Override
	public TourPackageDTO getPackageById(Long packageId) throws NotFoundException {
		return null;
	}

	@Override
	public TourPackageDTO createPackage(TourPackageDTO tourPackageDTO) {
		return null;
	}

	@Override
	public TourPackageDTO updatePackage(Long packageId, TourPackageDTO tourPackageDTO) throws NotFoundException {
		return null;
	}

	@Override
	public boolean deletePackageById(Long packageId) throws NotFoundException {
		return false;
	}

	private TourPackage getTourPackageById(Long packageId) throws NotFoundException {
		return null;
	}
}
