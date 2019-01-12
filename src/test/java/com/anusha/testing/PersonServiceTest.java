package com.anusha.testing;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.anusha.testing.service.PersonService;
import com.anusha.testing.service.PersonServiceImpl;

public class PersonServiceTest {

	private PersonService service;

	@Before
	public void setUp() {

		service = new PersonServiceImpl();
	}

	@Test
	public void shoudCreatePersonObject() {

		Person p1 = service.create("anusha", "rao", 12);
		Assert.assertEquals("anusha-rao", p1.getFullName());
	}
}
