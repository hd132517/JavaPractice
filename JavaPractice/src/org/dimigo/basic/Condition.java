package org.dimigo.basic;

public class Condition {
	public static void main(String[] args) {
		int distance = 10, money=0, imsi=0;
		String car = "고속버스";
		
		System.out.println("<< 고속도로 통행료 계산 >>");
		System.out.println("거리 : " + distance + " km");
		System.out.println("차량 : " + car);
		if(car == "고속버스"){
			money = 850;
		}
		else if(car == "경차"){
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
			if(car == "고속버스"){
				money += imsi*300;
			}
			else{
				money += imsi*200;
			}
		}
		System.out.println("통행료 : " + money + " 원");
	}

}
