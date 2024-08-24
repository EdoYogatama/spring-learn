package com.yogatama.edo.springlearn.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class MySqlDBService implements DataService{

	@Override
	public int[] retrieve() {
		return new int[] {1,2,3,4,5,6};
	}

}
