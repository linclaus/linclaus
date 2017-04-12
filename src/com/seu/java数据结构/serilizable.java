package com.seu.java数据结构;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class serilizable {
	public static void main(String[] args) throws IOException {
		Person p1 = new Person(1, "zhangsan");
		Person p2 = new Person(3, "lisi");
		FileOutputStream fos = new FileOutputStream("person.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(p1);
		oos.writeObject(p2);
		oos.close();
	}
	
}
class Person implements Serializable{
	public int age;
	public String name;
	public Person(int age,String name){
		this.age=age;
		this.name=name;
	}
	public Person() {
	}
}
