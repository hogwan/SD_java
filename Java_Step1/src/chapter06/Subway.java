package chapter06;

public class Subway {
	int lineNumber;
	int passengerCount;
	int money;

	// 생성자 오버로딩
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}

	public void take(int money) { //승객이 낸 돈
		this.money += money; // 버스 수입
		passengerCount++; // 승객의 수 증가
	}
	
	public void showinfo() {
		System.out.println(lineNumber + "번 지하철의 승객은 " + passengerCount + "명 이고, 수입은 " +money + "원 입니다");
	}
}
