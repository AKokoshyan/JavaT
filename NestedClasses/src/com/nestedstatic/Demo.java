package com.nestedstatic;

import java.util.LinkedList;

import com.nestedstatic.Car;

public class Demo {

	public static void main(String[] args) {
		Car ehe = new Car();
		ehe.print();
		LinkedList<String> list = new LinkedList<>();
		list.add("pesho");
		System.out.println(list.peek());
	}

}
