package com.dcode7.sharedutilities.ifsc;

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
@RequestMapping(path="/api/v1/ifsc")
public class IfscController {
	
	@Autowired
	private IfscService ifscService;

	@GetMapping("{ifsc}")
	public ResponseEntity<List<Ifsc>> getPincodeDetails(@PathVariable String ifsc) {
		return ResponseEntity.ok(ifscService.getDetailsByMatchingIfscPrefix(ifsc));
	}
}
