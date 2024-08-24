package com.yogatama.edo.springlearn.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MongoDBService implements DataService{

	@Override
	public int[] retrieve() {
		return new int[] {11,22,33,44,55,66};
	}

}
