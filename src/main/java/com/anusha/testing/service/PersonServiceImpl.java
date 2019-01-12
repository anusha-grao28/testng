package com.anusha.testing.service;

import com.anusha.testing.Person;

public class PersonServiceImpl implements PersonService {

	public Person create(String fname, String lName, Integer age) {
		
		return new Person(fname,lName,age);
	}

	public Person update(Person person,String fname, String lName, Integer age) {
		
		person.setfName(fname);
		person.setlName(lName);
		person.setAge(age);
		return person;
	}

}
