package chapter02;

import java.util.Scanner;

public class Example06 {

	public static void main(String[] args) {
		/*Scanner 을 사용하여 
		두 개의 불리언(boolean) 변수 isSunny와 isWarm을 입력받아, 
		날씨가 화창하면서 따뜻한지 여부를 출력하는 프로그램을 작성하세요.
		(날씨가 화창하면서 따뜻한지에 대한 변수 isNiceWeather 으로 작성하세요.)*/
		
		Scanner scan2 = new Scanner(System.in);
		System.out.println("날씨가 화창합니까?: ");
		boolean isSunny =scan2.nextBoolean();
				
		String result2;
		result2=(isSunny==true) ? "화창합니다":"아닙니다";
		System.out.println(result2);
	
		Scanner scan3 = new Scanner(System.in);
		System.out.println("날씨가 따뜻합니까?: ");	
		boolean isWarm =scan3.nextBoolean();
		
		String result3;
		result3=(isWarm==true) ? "따뜻합니다":"아닙니다";
		System.out.println(result3);	
		
		boolean isNiceWeather=isSunny && isWarm;
		String result4;
		result4=(isNiceWeather==true) ? "따뜻하면서 화창합니다":"따뜻하면서 화창하지 않습니다";
		System.out.println(result4);
		
	}

}
