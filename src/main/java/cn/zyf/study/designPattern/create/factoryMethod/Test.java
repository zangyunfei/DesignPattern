package cn.zyf.study.designPattern.create.factoryMethod;

import cn.zyf.study.designPattern.create.factoryMethod.impl.Factory;

/**
 * @author admin 工厂方法创建 "一种" 产品，他的着重点在于"怎么创建"，
 *         也就是说如果你开发，你的大量代码很可能围绕着这种产品的构造，初始化这些细节上面。
 *         也因为如此，类似的产品之间有很多可以复用的特征，所以会和模版方法相随。
 */
public class Test {

	public static void main(String[] args) {
		IProduct productA = new Factory().CreateProductA();
		IProduct productB = new Factory().CreateProductB();
	}

}
