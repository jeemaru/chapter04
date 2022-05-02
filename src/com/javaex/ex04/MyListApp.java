package com.javaex.ex04;

import java.util.ArrayList;

public class MyListApp {

	public static void main(String[] args) {
		
		ArrayList<Point> pList = new ArrayList<Point>();
		
		Point p01 = new Point(3,5);
		Point p02 = new Point(13,15);
		Point p03 = new Point(113,115);
		Point p04 = new Point(83,85);
		
		pList.add(p01);
		pList.add(p02);
		pList.add(p03);
		pList.add(p04);
		
		System.out.println(pList.size());
		System.out.println(pList.get(0).getX());
		System.out.println(pList.get(0).getY());
		System.out.println(pList.get(1));
		System.out.println(pList.get(0).toString());
		
		for(int i=0; i<pList.size(); i++) {
			System.out.println(pList.get(i).toString());
		}
		
		//메소드 소개
		System.out.println("===============");
		pList.remove(1); //해당 인덱스값, 배열만 지움
		//pList.remove(p01);
		for(int i=0; i<pList.size(); i++) {
			System.out.println(pList.get(i).toString());
		}
		
		System.out.println("===============");
		System.out.println(pList.toString());
		
		//for의 다른표현법 -->향상된 for문
		System.out.println("===============");
		for(Point p :pList) {
			System.out.println(p.toString());
			System.out.println(p.getX());
			System.out.println(p.getY());
		}
		
		//p04를 2번째 (방번호 1번[1])째 추가 --> 해당열을 지우고 대입
		System.out.println("===============");
		pList.add(1,p04);
		System.out.println(pList.toString());

	}

}
