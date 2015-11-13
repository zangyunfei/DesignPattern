package cn.zyf.study.designPattern.create.abstractFactory;

import cn.zyf.study.designPattern.create.abstractFactory.impl.FactoryOne;
import cn.zyf.study.designPattern.create.abstractFactory.impl.FactoryTwo;

/**
 * 抽象工厂 创建 "多种" 产品，他的着重点在于"创建什么产品"，
 * 
 * @author admin
 *
 */
public class Test {
	public static void main(String[] args) {
		IFactory f1 = new FactoryOne();
		f1.CreateProductA();
		f1.CreateProductB();

		IFactory f2 = new FactoryTwo();
		f2.CreateProductA();
		f2.CreateProductB();
	}
}
