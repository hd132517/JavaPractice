package org.dimigo.oop;

import java.util.Scanner;

public class Score {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("국어 점수 입력 => ");
		int kor = scanner.nextInt();
		System.out.println("수학 점수 입력 => ");
		int mth = scanner.nextInt();
		System.out.println("영어 점수 입력 => ");
		int eng = scanner.nextInt();
		scanner.close();
		
		StringBuffer sb = new StringBuffer();
		
		sb.append("<< 점수 출력 >>\n")
		  .append("국어점수 : " + kor + " 점\n")
		  .append("수학점수 : " + mth + " 점\n")
		  .append("영어점수 : " + eng + " 점\n")
		  .append("총점 : ")
		  .append(kor+mth+eng + " 점\n")
		  .append("평균 : " + String.format("%.1f", (double)(kor+mth+eng)/3) + " 점").toString();
		
		System.out.println(sb);
		
	}
}
