package org.dimigo.inheritance;

public class SmartPhoneTest {
	public static void main(String[] args) {
		SmartPhone[] phones ={
				new IPhone("Iphone 6", "애플", 700000),
				new Galaxy("갤럭시 S6", "삼성", 650000)
		};
		
		System.out.println(phones[0]);
		phones[0].turnOn();
		phones[0].pay();
		phones[0].useSpecialFunction(phones[0]);
		phones[0].turnOff();
		
		System.out.println();
		
		System.out.println(phones[1]);
		phones[1].turnOn();
		phones[1].pay();
		phones[1].useSpecialFunction(phones[1]);
		phones[1].turnOff();
	}
}













/*
        IPhone iPhone = new IPhone("iPhone 6", "애플", 700000);
        System.out.println(iPhone);
+        iPhone.turnOn();
+        iPhone.pay();
+        iPhone.useSpecialFunction();
+        iPhone.turnOff();
+
+        Galaxy galaxy = new Galaxy("갤럭시 S6", "삼성", 650000);
+        System.out.println(galaxy);
+        galaxy.turnOn();
+        galaxy.pay();
+        galaxy.useSpecialFunction();
+        galaxy.turnOff();*/