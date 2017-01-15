package cn.zyf.study.designPattern.create.singleton;

/**
 * 懒汉模式： 只有方法被调用，才会创建。
 * 
 * @author zyf
 *
 */
public class Singleton4 {
	private volatile static Singleton4 singleton;

	private Singleton4() {
	}

	public static Singleton4 getSingleton() {
		if (singleton == null) {
			synchronized (Singleton4.class) {
				if (singleton == null) {
					singleton = new Singleton4();
				}
			}
		}
		return singleton;
	}
}