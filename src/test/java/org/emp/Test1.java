package org.emp;

import org.testng.annotations.Test;

public class Test1 {
	@Test
	public void tst1() {
		System.out.println("block1"+Thread.currentThread().getId());
	}
	@Test
	public void tst2() {
		System.out.println("block2"+Thread.currentThread().getId());
	}
	@Test
	public void tst3() {
		System.out.println("block3"+Thread.currentThread().getId());
	}

}
