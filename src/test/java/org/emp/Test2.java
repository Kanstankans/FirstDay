package org.emp;

import org.testng.annotations.Test;

public class Test2 {
	@Test
	public void tst21() {
		System.out.println("Method2"+Thread.currentThread().getId());
	}
	@Test
	public void tst22() {
		System.out.println("Method21"+Thread.currentThread().getId());
	}
	@Test
	public void tst23() {
		System.out.println("Method22"+Thread.currentThread().getId());
	}

}
