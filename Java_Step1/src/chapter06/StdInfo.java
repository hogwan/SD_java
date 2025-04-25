package chapter06;

public class StdInfo {
	public String studentName;
	public int grade;
	public int money;
	
	public StdInfo(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		bus.take(1400);
		this.money -= 1400;
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1400);
		this.money -= 1400;
	}
	
	public void showinfo()
	{
		System.out.println(studentName + "님의 잔액은 " + money + "입니다.");
	}
}
