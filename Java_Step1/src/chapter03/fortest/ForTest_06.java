package chapter03.fortest;

public class ForTest_06 {

	public static void main(String[] args) {
		// 1에서부터 100까지의 수 중에서 3의 배수를 찾아 합을 계산하세요
		int num,total=0;
		for(num=1;num<=100;num++) {
			if( num %3==0)
				total += num;
			
			
		}
		System.out.println(total);
		

	}//m

}//c
