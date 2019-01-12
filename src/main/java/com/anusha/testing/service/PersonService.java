package com.anusha.testing.service;

import com.anusha.testing.Person;

public interface PersonService {
	
	public Person create(String fname, String lName, Integer age);
	
	
	public Person update(Person person, String fname, String lName, Integer age);


}
