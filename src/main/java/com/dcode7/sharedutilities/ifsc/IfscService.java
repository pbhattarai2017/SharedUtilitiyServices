package com.dcode7.sharedutilities.ifsc;

import java.util.List;

public interface IfscService {

	List<Ifsc> getDetailsByMatchingIfscPrefix(String ifscPrefix);

}
