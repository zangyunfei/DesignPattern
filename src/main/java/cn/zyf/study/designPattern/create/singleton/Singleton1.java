package cn.zyf.study.designPattern.create.singleton;

/**
 * 懒汉模式： 只有方法被调用，才会创建。
 * 
 * @author zyf
 *
 */
public class Singleton1 {

	private static Singleton1 instance = new Singleton1();

	private Singleton1() {
	}

	public static Singleton1 getInstance() {
		return instance;
	}

}