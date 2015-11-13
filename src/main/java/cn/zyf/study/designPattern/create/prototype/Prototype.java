package cn.zyf.study.designPattern.create.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 浅复制：将一个对象复制后，基本数据类型的变量都会重新创建，而引用类型，指向的还是原对象所指向的。
 * 深复制：将一个对象复制后，不论是基本数据类型还有引用类型，都是重新创建的。简单来说，就是深复制进行了完全彻底的复制，而浅复制不彻底。
 * 
 * @author admin
 *
 */
public class Prototype implements Cloneable, Serializable {

	public static void main(String[] args) throws Exception {
		// 原对象
		Prototype oral = new Prototype();
		oral.obj = new SerializableObject();

		// 复制后 两个对象
		Prototype p1 = (Prototype) oral.clone();
		Prototype p2 = (Prototype) oral.deepClone();

		System.out.println(p1 == oral); // false 不是同一个对象
		System.out.println(p1.obj == oral.obj); // true 引用是一个对象

		System.out.println(p2 == oral); // false 对象不同
		System.out.println(p2.obj == oral.obj); // false 引用不同
	}

	private static final long serialVersionUID = 1L;
	private String string;

	private SerializableObject obj;

	/* 浅复制 */
	public Object clone() throws CloneNotSupportedException {
		Prototype proto = (Prototype) super.clone();
		return proto;
	}

	/* 深复制 */
	public Object deepClone() throws IOException, ClassNotFoundException {

		/* 写入当前对象的二进制流 */
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(this);

		/* 读出二进制流产生的新对象 */
		ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bis);
		return ois.readObject();
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	public SerializableObject getObj() {
		return obj;
	}

	public void setObj(SerializableObject obj) {
		this.obj = obj;
	}

}

class SerializableObject implements Serializable {

	/**
	 * 
	 */
	public static final long serialVersionUID = 8053839250723484993L;
}