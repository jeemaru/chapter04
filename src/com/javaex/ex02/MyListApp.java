package com.javaex.ex02;

public class MyListApp {

	public static void main(String[] args) {
		
		MyList pList = new MyList();
		
		Point p01 = new Point(3,5);
		Point p02 = new Point(13,15);
		
		pList.add(p01);
		pList.add(p02);
		
		System.out.println(pList.size());
		System.out.println(pList.get(0));

		MyList cList = new MyList();
		
		Circle c01 = new Circle(5);
		Circle c02 = new Circle(15);
		
		cList.add(c01);
		cList.add(c02);

		for(int i=0; i<cList.size(); i++) {
			System.out.println(cList.get(i).toString());
			System.out.println(((Circle)cList.get(i)).getRadius());
		}
	}

}
