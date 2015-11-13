package cn.zyf.study.designPattern.create.simple;

import cn.zyf.study.designPattern.create.simple.impl.Factory;

/**
 * 简单工程并不包含在 设计模式23种之中
 * 
 * @author admin
 *
 */
public class Test {
	public static void main(String[] args) {
		IFactory f = new Factory();
		f.CreateProduct("A");
		f.CreateProduct("B");
	}
}
