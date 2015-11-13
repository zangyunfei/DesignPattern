package cn.zyf.study.designPattern.create.factoryMethod.impl;

import cn.zyf.study.designPattern.create.factoryMethod.IFactory;
import cn.zyf.study.designPattern.create.factoryMethod.IProduct;

public class Factory implements IFactory {

	public IProduct CreateProductA() {
		return new CreateProductA();
	}

	public IProduct CreateProductB() {
		return new CreateProductB();
	}

}
