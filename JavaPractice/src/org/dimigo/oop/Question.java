package org.dimigo.oop;

import java.util.Scanner;

public class Question {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("지금 교시는?");
		String answer1 = scanner.nextLine();
		if(answer1.equals("3")){
			System.out.println("정답입니다!! ^^");
		}
		else{
			System.out.println("틀렸습니다!! ㅜㅜ");
		}
		
		System.out.println();

		System.out.println("지금 배우는 과목은?");
		String answer2 = scanner.nextLine();
		if(answer2.equals("자바")){
			System.out.println("정답입니다!! ^^");
		}
		else{
			System.out.println("틀렸습니다!! ㅜㅜ");
		}
		
		System.out.println();

		System.out.println("그 과목 선생님 성함은?");
		String answer3 = scanner.nextLine();
		if(answer3.equals("하미영")){
			System.out.println("정답입니다!! ^^");
		}
		else{
			System.out.println("틀렸습니다!! ㅜㅜ");
		}
		
		scanner.close();
	}
}
