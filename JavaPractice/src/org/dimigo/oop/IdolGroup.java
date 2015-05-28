package org.dimigo.oop;

public class IdolGroup {
	public static void main(String[] args) {
		String[] lolGroup ={"탑", "미드", "원딜", "서폿", "정글"};
		
		String[][] charArr = {
				{"자크", "티모", "잭스", "말파이트", "레넥톤"},
				{"피즈", "카타리나", "탈론", "제드", "야스오"},
				{"베인", "이즈리얼", "케이틀린", "루시안", "코그모"},
				{"소나", "쓰레쉬", "룰루", "나미", "블리츠크랭크"},
				{"판테온", "마스터 이", "리신", "바이", "피들스틱"}
		};
		
		for(int i = 0; i<lolGroup.length; i++){
			System.out.printf("<< %s 멤버 >>\n", lolGroup[i]);
			for(String name : charArr[i]){
				System.out.println(name);
			}
			System.out.println();
		}
	}
}
