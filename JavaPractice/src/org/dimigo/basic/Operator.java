package org.dimigo.basic;

public class Operator {
	public static void main(String[] args) {
		double a1=9, b1=10, h1=5.8, a2=9, h2=5.4;
		double S = (a1+b1)*h1/2, P = a2*h2;
		System.out.println("<< 도형 넓이 비교 >>");
		System.out.println("사다리꼴 넓이 : " + S);
		System.out.println("평행사변형 넓이 : " + P);
		System.out.println("");
		if(S>P){
			System.out.println("사다리꼴이 평행사변형보다 " + (S-P) + " 더 큽니다");
		}
		else if(S<P){
			System.out.println("평행사변형이 사다리꼴보다 " + (P-S) + " 더 큽니다");
		}
		else System.out.println("두개의 도형의 넓이가 같습니다");
	}
}
