package com.dcode7.sharedutilities.ifsc;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface IfscRepository extends CrudRepository <Ifsc, String>{

	List<Ifsc> findByCodeStartingWith(String prefix);
	
}
