package com.dcode7.sharedutilities.pincode;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="*")
@RequestMapping(path="/api/v1/pincode")
public class PincodeController {
	
	@Autowired
	private PincodeService pincodeService;

	@GetMapping("{pincode}")
	public ResponseEntity<List<Pincode>> getPincodeDetails(@PathVariable int pincode) {
		return ResponseEntity.ok(pincodeService.getDetailsByPincode(pincode));
	}
}
