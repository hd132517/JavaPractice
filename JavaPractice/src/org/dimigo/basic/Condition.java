package org.dimigo.basic;

public class Condition {
	public static void main(String[] args) {
		int distance = 10, money=0, imsi=0;
		String car = "��ӹ���";
		
		System.out.println("<< ��ӵ��� ����� ��� >>");
		System.out.println("�Ÿ� : " + distance + " km");
		System.out.println("���� : " + car);
		if(car == "��ӹ���"){
			money = 850;
		}
		else if(car == "����"){
			money = 300;
		}
		else {
			money = 600;
		}
		if(distance>10){
			distance-=10;
			while(distance>10){
				distance-=10;
				imsi++;
			}
			if(distance>0) imsi++;
			if(car == "��ӹ���"){
				money += imsi*300;
			}
			else{
				money += imsi*200;
			}
		}
		System.out.println("����� : " + money + " ��");
	}

}
