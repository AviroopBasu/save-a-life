package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.DonorDto;
import com.example.dto.GenericResponse;
import com.example.service.DonorService;

@RestController
@RequestMapping("/donor")
public class DonorController {
	@Autowired
	private DonorService donorService;
	
	@PostMapping("/add")
	public GenericResponse addDonor(@RequestBody DonorDto donorDto) {
		return donorService.addDonor(donorDto);
	}

}
