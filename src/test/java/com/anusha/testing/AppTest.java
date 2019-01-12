package com.anusha.testing;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AppTest {

	private Person p1;

	@Before
	public void setUp() {
		p1 = new Person("anusha", "rao", 26);

	}

	@Test
	public void shouldGiveCorrectFullName() {

		String actualFullName = p1.getFullName();

		Assert.assertEquals("anusha-rao", actualFullName);

	}

	@Test
	public void shouldGiveCorrectFirstName() {

		String actual = p1.getfName();

		Assert.assertEquals("anusha", actual);

	}
}
