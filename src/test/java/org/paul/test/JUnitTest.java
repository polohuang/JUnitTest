package org.paul.test;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.paul.Add;

public class JUnitTest {
	private int a, b;
	
	@Before
	public void init() {
		this.a = 1;
		this.b = 2;
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void addTest() {
		Add add = new Add(a, b);
		Assert.assertEquals(3, add.add());
//		Assert.assertEquals(4, add.add());
	}
}
