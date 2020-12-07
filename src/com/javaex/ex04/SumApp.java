package com.javaex.ex04;

import java.util.Scanner;

public class SumApp {

	public static void main(String[] args) {
		
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 공백으로 구분해서 입력하세요");
		String numLine = sc.nextLine();

		//코드를 작성하세요
		String[] numArray = numLine.split(" ");	//numLine을 공백단위로 잘라서 numArray 배열에 넣음.
		for(int i = 0; i < numArray.length; i++) {
			sum += Integer.parseInt(numArray[i]);	//String을 integer 형식으로 바꿔줌.
		}
		
		System.out.println("합:" + sum);
		
		sc.close();
	}

}
