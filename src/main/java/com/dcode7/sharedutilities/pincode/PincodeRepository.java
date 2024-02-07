package com.dcode7.sharedutilities.pincode;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.lang.Nullable;


public interface PincodeRepository extends CrudRepository<Pincode, Integer> {

	List<Pincode> findByPinCode(@Nullable Integer pincode);

}
