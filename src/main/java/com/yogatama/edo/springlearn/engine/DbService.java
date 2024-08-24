package com.yogatama.edo.springlearn.engine;

import java.util.Arrays;

import org.springframework.stereotype.Component;

import com.yogatama.edo.springlearn.bean.DataService;

@Component
public class DbService {

	private DataService dataService;

	public DbService(DataService dataService) {
		this.dataService = dataService;
	}
	
	public int findMax() {
		return Arrays.stream(dataService.retrieve()).max().orElse(0);
	}
	
}
