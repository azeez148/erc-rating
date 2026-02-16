package com.nest.erc.domain;

import org.springframework.stereotype.Component;

@Component
public class ErcObjectModelService {

	
	public String pingMe(String from) {
		return from+" -- ping worked fine";
	}
	
}
