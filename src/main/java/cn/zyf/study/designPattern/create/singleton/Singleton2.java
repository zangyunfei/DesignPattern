package cn.zyf.study.designPattern.create.singleton;

/**
 * 饿汉模式：类被加载 及存在，实例被提前创建 ,1重锁，效率略低
 * 
 * @author zyf
 *
 */
public class Singleton2 {

	private static Singleton2 instance = null;

	private Singleton2() {
	}

	public static synchronized Singleton2 getInstance() {
		if (instance == null) {
			instance = new Singleton2();
		}
		return instance;
	}

}