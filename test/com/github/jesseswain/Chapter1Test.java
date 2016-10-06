package com.github.jesseswain;

import static org.junit.Assert.*;

import org.junit.Test;

public class Chapter1Test {
    Chapter1 chapter1 = new Chapter1();
	@Test
	public void isUniqueShouldFindDuplicates() {
		assertFalse(chapter1.isUnique("aa"));
		assertFalse(chapter1.isUnique("abbot"));
		assertFalse(chapter1.isUnique("bib"));
		assertFalse(chapter1.isUnique("circular"));
		assertFalse(chapter1.isUnique("99"));
		assertFalse(chapter1.isUnique("!!"));
		
		assertTrue(chapter1.isUnique("help"));
		assertTrue(chapter1.isUnique("flask"));
		assertTrue(chapter1.isUnique("triangle"));
		assertTrue(chapter1.isUnique("race"));
		assertTrue(chapter1.isUnique(""));
		assertTrue(chapter1.isUnique("901"));
		assertTrue(chapter1.isUnique("#!"));
		assertTrue(chapter1.isUnique("cC"));
		assertTrue(chapter1.isUnique(null));
	}
}
