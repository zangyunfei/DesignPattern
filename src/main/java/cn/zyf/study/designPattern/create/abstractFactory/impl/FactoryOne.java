package cn.zyf.study.designPattern.create.abstractFactory.impl;

import cn.zyf.study.designPattern.create.abstractFactory.IFactory;
import cn.zyf.study.designPattern.create.abstractFactory.ProductA;
import cn.zyf.study.designPattern.create.abstractFactory.ProductB;

/**
 * 生产规格 1 的产品
 * 
 * @author admin
 *
 */
public class FactoryOne implements IFactory {

	public ProductA CreateProductA() {
		return new CreateProductA1();
	}

	public ProductB CreateProductB() {
		return new CreateProductB1();
	}

}
