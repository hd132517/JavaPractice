package org.dimigo.basic;

public class TypeCasting {
	public static void main(String[] args) {
		System.out.println("<< 디미베네 연간 인건비 >>");
		long l1 = 1700000;
		long l2 = 3;
		long l3 = 1500;
		System.out.printf("월 평균 급여 : %,d원\n", l1);
		System.out.printf("점포 내 직원 수 : %,d명\n", l2);
		System.out.printf("점포 수 : %,d개\n", l3);
		System.out.printf("연간 인건비 : %,d원", l1*l2*l3*12);
		// TODO Auto-generated method stub

	}
}
