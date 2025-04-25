package chapter02;

import java.util.Scanner;

public class Example05T {

	public static void main(String[] args) {
		/*
		 1. Scanner를 이용하여 값을 입력받아서 양수인지 음수인지를 판별하는 프로그램
		 2. 삼항연산자를 사용하여 변수방에 저장된 수가 양수면 "양수입니다."
		    그렇지 않으면 "음수 또는 0입니다."라고 출력이 되어야함
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("숫자 입력: ");
		
		int number=scan.nextInt();
		//양수인지 여부를 판별하는 변수방 isPositive
		boolean isPositive=number>0;
		
		//삼항연산
		String result=isPositive ? "양수입니다":"음수 또는 0입니다";
		System.out.println(result);
		
		/*Scanner 을 사용하여 
		두 개의 불리언(boolean) 변수 isSunny와 isWarm을 입력받아, 
		날씨가 화창하면서 따뜻한지 여부를 출력하는 프로그램을 작성하세요.
		(날씨가 화창하면서 따뜻한지에 대한 변수 isNiceWeather 으로 작성하세요.)*/
		
		Scanner scan2=new Scanner(System.in);
		System.out.println("날씨가 화창한가요? (true/false):  ");
		boolean isSunny=scan2.nextBoolean();
		
		Scanner scan3=new Scanner(System.in);
		System.out.println("날씨가 따뜻한가요? (true/false):  ");
		boolean isWarm=scan3.nextBoolean();
		
		//판단(논리연산)
		boolean isNiceWeather=isSunny&&isWarm;
		System.out.println("날씨가 화창하면서 따뜻한가요? " +isNiceWeather);
		
		
		
	}

}
