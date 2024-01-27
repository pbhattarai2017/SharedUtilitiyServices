package com.dcode7.sharedutilities.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.lang.Nullable;

import com.dcode7.sharedutilities.models.Pincode;


public interface PincodeRepository extends CrudRepository<Pincode, Integer> {
	Iterable<Pincode> findByPinCode(@Nullable Integer pincode);
}
