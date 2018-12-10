package cn.zyf.study.designPattern.create.singleton;

import org.junit.Assert;
import org.junit.Test;

/**
 * test
 */
public class SingletonTest {

	@Test
	public void getInstance1() {
		Singleton1 s1 = Singleton1.getInstance();
		Singleton1 s2 = Singleton1.getInstance();
		Assert.assertTrue(s1 == s2);
	}

	@Test
	public void getInstance2() {
		Singleton2 s1 = Singleton2.getInstance();
		Singleton2 s2 = Singleton2.getInstance();
		Assert.assertTrue(s1 == s2);
	}

	@Test
	public void getInstance3() {
		Singleton1 s1 = Singleton1.getInstance();
		Singleton1 s2 = Singleton1.getInstance();
		Assert.assertTrue(s1 == s2);
	}

	@Test
	public void getInstance4() {
		Singleton4 s1 = Singleton4.getSingleton();
		Singleton4 s2 = Singleton4.getSingleton();
		Assert.assertTrue(s1 == s2);
	}
}
