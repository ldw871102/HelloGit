package com.test;

public class ClassOverloading {

	void f1(Animal a){
		System.out.println(a.getName());
	}
	
	void f2(Dog d){
		System.out.println(d.getName());
	}
	public static void main(String[] args) {
		
		ClassOverloading co = new ClassOverloading();
		Animal a = new Animal();
		Dog d = new Dog();
		co.f1(a);
		co.f1(d);
		//co.f2(a);编译期错误
		co.f2((Dog)a);//不能转换的错误
	}
	

}

class Animal{
	int id=1;
	String name="animal";
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

class Dog extends Animal{
	String color="green";

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
}
