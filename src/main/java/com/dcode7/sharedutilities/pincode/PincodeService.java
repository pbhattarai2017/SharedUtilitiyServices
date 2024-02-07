package com.dcode7.sharedutilities.pincode;

import java.util.List;

public interface PincodeService {
	
	List<Pincode> getDetailsByPincode(Integer pincode);

}
