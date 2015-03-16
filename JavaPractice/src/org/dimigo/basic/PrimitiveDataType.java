package org.dimigo.basic;

public class PrimitiveDataType {
	public static void main(String[] args){
		String name = "아이유";
		boolean gender = true;
		int age = 23;
		double height = 161.8d;
		float weight = 44.3f;
		char bloodtype = 'A';
		
		System.out.printf("<< 아이유 프로필 >>\n");
		System.out.printf("이름 : " + name);
		if(gender) System.out.printf("\n성별 : 여자");
		else System.out.println("\n성별 : 남자");
		System.out.printf("\n나이 : " + age + " 세");
		System.out.printf("\n키 : " + height + " cm");
		System.out.printf("\n몸무게 : " + weight + " kg");
		System.out.printf("\n혈액형 : " + bloodtype + " 형");
	}
}
