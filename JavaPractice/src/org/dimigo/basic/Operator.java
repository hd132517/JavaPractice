package org.dimigo.basic;

public class Operator {
	public static void main(String[] args) {
		double a1=9, b1=10, h1=5.8, a2=9, h2=5.4;
		double S = (a1+b1)*h1/2, P = a2*h2;
		System.out.println("<< ���� ���� �� >>");
		System.out.println("��ٸ��� ���� : " + S);
		System.out.println("����纯�� ���� : " + P);
		System.out.println("");
		if(S>P){
			System.out.println("��ٸ����� ����纯������ " + (S-P) + " �� Ů�ϴ�");
		}
		else if(S<P){
			System.out.println("����纯���� ��ٸ��ú��� " + (P-S) + " �� Ů�ϴ�");
		}
		else System.out.println("�ΰ��� ������ ���̰� �����ϴ�");
	}
}
