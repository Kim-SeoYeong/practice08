package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);

    	while(true) {
    		System.out.print(">> ");
    		
    		String str = sc.nextLine();	//일단 str에 모든 문자열을 담음
    		String[] calArray = str.split(" ");	//공백 제거
        	
    		//먼저 str값을 검사해줌.
    		if (str.equals("/q")) {	
        		System.out.println("종료합니다.");
        		break;
        	}
    		
    		int a = Integer.parseInt(calArray[0]);
    		String cal = calArray[1];
    		int b = Integer.parseInt(calArray[2]);
    		
    		if (cal.equals("+")) {
        		Add add = new Add();
 		    	add.setValue(a,b);
 		    	System.out.println(">> " + add.calculate()); 
        	} else if (cal.equals("-")) {
        		Sub sub = new Sub();
		    	sub.setValue(a,b);
		    	System.out.println(">> " + sub.calculate());
        	} else if (cal.equals("*")) {
        		Mul mul = new Mul();
		    	mul.setValue(a,b);
		    	System.out.println(">> " + mul.calculate());
        	} else if (cal.equals("/")) {
        		Div div = new Div();
		    	div.setValue(a,b);
		    	System.out.println(">> " + div.calculate());
        	} else {
			    System.out.println("알 수 없는 연산입니다.");
        	}
    	}
    	sc.close();
    }
}
