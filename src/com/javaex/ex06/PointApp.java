package com.javaex.ex06;

public class PointApp {

	public static void main(String[] args) {
		
		Point p1 = new Point(2, 3);
		Point p2 = new Point(2, 3);
		Point p3 = new Point(5, 3);
		Point p4 = p1;
		
		System.out.println(p1 == p2);
		System.out.println(p2 == p3);
		System.out.println(p3 == p4);
		System.out.println(p4 == p1);		
		System.out.println(p1.equals(p2));
		System.out.println(p4.equals(p1));
		
		//예상 결과
		/*
		false
		false
		false
		true
		false
		true 
		*/
		
		//Object는 모든 클래스의 최상위 클래스이며 equals() 메소드는 Object 클래스 안에 
		//선언되어져 있는 메소드이다. 클래스들은 Object 클래스를 자동적으로 상속받을 수 있게
		//되어져있기 때문에 extends를 생략해도 상관없다.
	}

}


