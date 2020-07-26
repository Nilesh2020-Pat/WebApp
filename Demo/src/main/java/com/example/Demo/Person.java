package com.example.Demo;

import java.io.Serializable;

public class Person implements Serializable {
	public int id;
	public String fname;
	public int age;

	public Person(int id, String fname, int age) {
		this.id = id;
		this.fname = fname;
		this.age = age;
	}

	public Person() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", fname=" + fname + ", age=" + age + "]";
	}
	

}
