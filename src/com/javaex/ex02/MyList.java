package com.javaex.ex02;

public class MyList {
	
	private Object[] oArray;
	private int crtpos; //다음에 추가해줄 방번호

	
	public  MyList() {
		//배열 2개-->원래는 만들지 않음
		oArray = new Object[2];
		crtpos = 0;
	}
	
	public void add(Object obj) {
		//현재배열갯수+1
		//기존배열의 내용은 그대로 복사
		//마지막바에 point를 대입
		oArray[crtpos] = obj;
		crtpos = crtpos+1;
	}
	
	public int size() {
		return crtpos;
	}
	
	public Object get(int index) {
		return oArray[index];
	}

}
