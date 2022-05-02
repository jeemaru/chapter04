package com.javaex.ex01;

public class PointList {

	private Point[] pArray;
	private int crtpos; //다음에 추가해줄 방번호

	
	public PointList() {
		//배열 3개-->원래는 만들지 않음
		pArray = new Point[3];
		crtpos = 0;
	}
	
	public void add(Point  point) {
		//현재배열갯수+1
		//기존배열의 내용은 그대로 복사
		//마지막바에 point를 대입
		
		pArray[crtpos] = point;
		crtpos = crtpos+1;
	}
	
	public int size() {
		return crtpos;
	}
	
	public Point get(int index) {
		return pArray[index];
	}
	
}
