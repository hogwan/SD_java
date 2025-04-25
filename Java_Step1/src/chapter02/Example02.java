package chapter02;

public class Example02 {

	public static void main(String[] args) {
		/*soldesk 과수원
		 * 배, 사과, 오렌지를 키우고 있는데 하루에 생산되는 양은 각각 5개, 7개, 5개 입니다.
		 * 과수원에서 하루에 생산되는 총 과일의 갯수를 출력하고,
		 * 시간당(24) 전체 과일의 평균 생산 갯수를 출력 하시오.
		 * (단, 평균값을 담는 데이터 타입은 float)로 정의한다.
		 */
		
		int d,e,f;
		d=5;
		e=7;
		f=5;
		
		float total=(d+e+f)/24f;
		System.out.println("하루에 생산되는 과일의 총 갯수: "+(d+e+f));
		System.out.println("시간당 과일의 평균 생산 갯수: "+total);
		System.out.println("=====================================");
		
	}

}
