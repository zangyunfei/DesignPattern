package cn.zyf.study.designPattern.create.simple.impl;

import cn.zyf.study.designPattern.create.simple.IFactory;
import cn.zyf.study.designPattern.create.simple.IProduct;

public class Factory implements IFactory {

	public IProduct CreateProduct(String type) {
		switch (type) {
		case "A":
			return new CreateProductA();
		case "B":
			return new CreateProductB();
		}
		return null;
	}
}
