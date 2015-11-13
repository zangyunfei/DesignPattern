package cn.zyf.study.designPattern.create.abstractFactory.impl;

import cn.zyf.study.designPattern.create.abstractFactory.IFactory;
import cn.zyf.study.designPattern.create.abstractFactory.ProductA;
import cn.zyf.study.designPattern.create.abstractFactory.ProductB;

public class FactoryTwo implements IFactory {

	public ProductA CreateProductA() {
		return new CreateProductA2();
	}

	public ProductB CreateProductB() {
		return new CreateProductB2();
	}

}
