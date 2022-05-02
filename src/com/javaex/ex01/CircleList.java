package com.javaex.ex01;

public class CircleList {
	
	private Circle[] cArray;
	private int crtpos; // 다음에 추가해줄 방번호!!
	
	
	public CircleList() {
		cArray = new Circle[2]; //배열
		crtpos = 0;
	}
	
	public void add(Circle Circle) {
		cArray[crtpos] = Circle; //배열의 넘버값
		crtpos = crtpos+1;
	}
	
	public int size() {
		return crtpos; //배열 수
	}

	public Circle get(int index) {
		return cArray[index];
	}
	
	

}
