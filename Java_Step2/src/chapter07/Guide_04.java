package chapter07;

import java.util.Scanner;

public class Guide_04 {

	// 멤버변수
	static String point;
	Guest[] guest;
	Scanner scan;

	// 생성자
	public Guide_04(int n) {
		// 목적지
		point = "발리";

		// 관광객 수 만큼 메모리 확보
		guest = new Guest[n];

		for (int i = 0; i < n; i++) {
			guest[i] = new Guest();
		}
	}
	
	public void changePoint(String point) {
		Guide_04.point = point;
	}
	
	public void showGuests()
	{
		int index = 1;
		for(Guest g : guest)
		{
			System.out.println(index + "번째 게스트 정보");
			System.out.println("이름 -> " + g.getName());
			System.out.println("성별 -> " + g.getGender());
			System.out.println("목적지 -> " + point);
			System.out.println();
			index++;
		}
	}
	
	public static String getPoint() {
		return point;
	}
}
