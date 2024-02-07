package com.dcode7.sharedutilities.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dcode7.sharedutilities.models.Pincode;
import com.dcode7.sharedutilities.repositories.PincodeRepository;

@RestController
@CrossOrigin(origins="*")
@RequestMapping(path="/api/v1/pincode")
public class PincodeController {
	
	@Autowired
	private PincodeRepository pincodeRepository;

	@GetMapping("{pincode}")
	public @ResponseBody Iterable<Pincode> getPincodeDetails(@PathVariable int pincode) {
		return pincodeRepository.findByPinCode(pincode);
	}
}
