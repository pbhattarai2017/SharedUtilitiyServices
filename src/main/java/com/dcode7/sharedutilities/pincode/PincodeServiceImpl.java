package com.dcode7.sharedutilities.pincode;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PincodeServiceImpl implements PincodeService {
	
	@Autowired
	private PincodeRepository pincodeRepository;
	
		
	@Override
	public List<Pincode> getDetailsByPincode(Integer pincode) {
		return pincodeRepository.findByPinCode(pincode);
	}

}
