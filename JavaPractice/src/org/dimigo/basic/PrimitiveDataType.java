package org.dimigo.basic;

public class PrimitiveDataType {
	public static void main(String[] args){
		String name = "������";
		boolean gender = true;
		int age = 23;
		double height = 161.8d;
		float weight = 44.3f;
		char bloodtype = 'A';
		
		System.out.printf("<< ������ ������ >>\n");
		System.out.printf("�̸� : " + name);
		if(gender) System.out.printf("\n���� : ����");
		else System.out.println("\n���� : ����");
		System.out.printf("\n���� : " + age + " ��");
		System.out.printf("\nŰ : " + height + " cm");
		System.out.printf("\n������ : " + weight + " kg");
		System.out.printf("\n������ : " + bloodtype + " ��");
	}
}
