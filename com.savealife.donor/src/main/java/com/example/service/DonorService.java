package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dto.DonorDto;
import com.example.dto.GenericResponse;
import com.example.repository.DonorRepository;

@Service
public class DonorService {
	
	@Autowired
	private DonorRepository donorRepository;
	private GenericResponse genericResponse;
 
	public GenericResponse addDonor(DonorDto donor) {
		try {
			donorRepository.save(donor);
			genericResponse = new GenericResponse("Successfully Added", 200);
		}
		catch(Exception ex) {
			genericResponse = new GenericResponse("Something went wrong", 500);
		}
		return genericResponse;
			
	}
}
