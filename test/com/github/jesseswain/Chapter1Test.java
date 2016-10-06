package com.github.jesseswain;

import static org.junit.Assert.*;

import org.junit.Test;

public class Chapter1Test {
    Chapter1 chapter1 = new Chapter1();

	@Test
	public void test() {
		assertEquals(1, chapter1.tester()); 
	}

}
