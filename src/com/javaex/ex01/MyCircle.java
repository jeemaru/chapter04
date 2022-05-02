package com.javaex.ex01;

public class MyCircle {

	public static void main(String[] args) {
		
		CircleList cList = new CircleList();
		
		Circle c01 = new Circle(12);
		Circle c02 = new Circle(2);
		
		cList.add(c01);
		cList.add(c02);
		
		System.out.println(cList.size());
		
		Circle c1 = cList.get(1);
		System.out.println(c1.getRadius());
		
		for(int i=0; i<cList.size(); i++) {
			System.out.println(cList.get(i).toString());
		}

	}

}
