package org.dimigo.oop;

public class CarTest {
	public static void main(String[] args) {
		Car3 car1 = new Car3("�����ڵ���", "���׽ý�", "������", 225, 50000000);
		
		System.out.println("<< �ڵ��� ��� >>");
		System.out.println("������� : " + car1.getCompany());
		System.out.println("�𵨸� : " + car1.getModel());
		System.out.println("���� : " + car1.getColor());
		System.out.println("�ִ�ӵ� : " + car1.getMaxSpeed() + "km");
		System.out.println("���� : " + String. format("%,d", car1.getPrice()) + "��");
		System.out.println("");
		
		Car3 car2 = new Car3("����ڵ���", "K7", "���", 246);
		
		System.out.println("������� : " + car2.getCompany());
		System.out.println("�𵨸� : " + car2.getModel());
		System.out.println("���� : " + car2.getColor());
		System.out.println("�ִ�ӵ� : " + car2.getMaxSpeed() + "km");
		System.out.println("���� : " + String. format("%,d", car2.getPrice()) + "��");
		System.out.println("");

		Car3 car3 = new Car3("�Ｚ�ڵ���", "SM7", "ȸ��");
		
		System.out.println("������� : " + car3.getCompany());
		System.out.println("�𵨸� : " + car3.getModel());
		System.out.println("���� : " + car3.getColor());
		System.out.println("�ִ�ӵ� : " + car3.getMaxSpeed() + "km");
		System.out.println("���� : " + String. format("%,d", car3.getPrice()) + "��");
	}
}

/*
package org.dimigo.oop;

public class CarTest {
	public static void main(String[] args) {
		Car2 car1 = new Car2("�����ڵ���", "���׽ý�", "������", 225, 50000000);
		
		System.out.println("<< �ڵ��� ��� >>");
		System.out.println("������� : " + car1.getCompany());
		System.out.println("�𵨸� : " + car1.getModel());
		System.out.println("���� : " + car1.getColor());
		System.out.println("�ִ�ӵ� : " + car1.getMaxSpeed() + "km");
		System.out.println("���� : " + String. format("%,d", car1.getPrice()) + "��");
		System.out.println("");
		
		Car2 car2 = new Car2("����ڵ���", "K7", "���", 246, 40000000);
		
		System.out.println("������� : " + car2.getCompany());
		System.out.println("�𵨸� : " + car2.getModel());
		System.out.println("���� : " + car2.getColor());
		System.out.println("�ִ�ӵ� : " + car2.getMaxSpeed() + "km");
		System.out.println("���� : " + String. format("%,d", car2.getPrice()) + "��");
		System.out.println("");

		Car2 car3 = new Car2("�Ｚ�ڵ���", "SM7", "ȸ��", 200, 38000000);
		
		System.out.println("������� : " + car3.getCompany());
		System.out.println("�𵨸� : " + car3.getModel());
		System.out.println("���� : " + car3.getColor());
		System.out.println("�ִ�ӵ� : " + car3.getMaxSpeed() + "km");
		System.out.println("���� : " + String. format("%,d", car3.getPrice()) + "��");
	}
}
*/
