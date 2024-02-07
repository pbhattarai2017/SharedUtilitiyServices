package com.dcode7.sharedutilities.ifsc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IfscServiceImpl implements IfscService {
	
	@Autowired
	private IfscRepository ifscRepository;
	

	@Override
	public List<Ifsc> getDetailsByMatchingIfscPrefix(String ifscPrefix) {
		List<Ifsc> ifscList = new ArrayList<>();
		int minimumPrefixLength = 3;
		if(ifscPrefix.length() >= minimumPrefixLength) {
			ifscList = ifscRepository.findByCodeStartingWith(ifscPrefix);
		}
		return ifscList;
	}

}
