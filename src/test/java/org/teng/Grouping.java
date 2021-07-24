package org.teng;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class Grouping {
	@Test(groups="a")
	private void tst1() {
		System.out.println("iam i");
	}
	@Test(groups="b")
	private void tst2() {
		assertTrue(false);
		System.out.println("im 2");
		
	}
	@Test(groups="a")
	private void tst3() {
		System.out.println("im 3");
	}
	@Test(groups="b")
	private void tst4() {
		System.out.println("im 4");
	}
}
