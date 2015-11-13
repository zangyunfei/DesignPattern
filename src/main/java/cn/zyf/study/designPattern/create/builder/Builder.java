package cn.zyf.study.designPattern.create.builder;

import java.util.ArrayList;
import java.util.List;

import cn.zyf.study.designPattern.create.factoryMethod.IProduct;
import cn.zyf.study.designPattern.create.factoryMethod.impl.Factory;

/**
 * 建造者模式是将各种产品集中起来进行管理
 * 
 * @author admin
 *
 */
public class Builder {

	private List<IProduct> list = new ArrayList<IProduct>();

	public void produceA(int count) {
		for (int i = 0; i < count; i++) {
			list.add(new Factory().CreateProductA());
		}
	}

	public void produceB(int count) {
		for (int i = 0; i < count; i++) {
			list.add(new Factory().CreateProductB());
		}
	}
}