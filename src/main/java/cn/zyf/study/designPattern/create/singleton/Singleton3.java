package cn.zyf.study.designPattern.create.singleton;

/**
 * 饿汉模式：类被加载 及存在，实例被提前创建
 * 
 * @author zyf
 *
 */
public class Singleton3 {

	private Singleton3() {
	}

	private static class SingletonInstance {
		private static final Singleton3 INSTANCE = new Singleton3();
	}

	public static Singleton3 getInstance() {
		return SingletonInstance.INSTANCE;
	}
}