package cn.zyf.study.designPattern.structure.classStructure;

public class Adapter extends Source implements Targetable {

	public void method2() {
		System.out.println("this is the targetable method!");
	}
}