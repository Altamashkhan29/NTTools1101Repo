package com.nt.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.nt.service.Arthmetic;

public class AppTest {

	@Test
	public void testWithPositives() {
		Arthmetic ar=new Arthmetic();
		int expected =40;
		int actual=ar.sum(20, 20);
		assertEquals(expected, actual);
		
	}
}
