package chapter04;

public class TwoDimension_09 {

	public static void main(String[] args) {
		// 이차원 배열
		int arr[][]=new int[2][3]; //2행 3열 arr.length=줄 arr[0].length=칸
		int n=0;
		int arr1[][]= {{1,2,3},{4,5,6}};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				n++;
				System.out.print((arr[i][j]=n)+" ");
			}
			System.out.println();
		}//f
		
		System.out.println("-----------------");
		System.out.println(arr.length + "헁");//2
		System.out.println(arr[0].length + "열");//2
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				n++;
				System.out.print((arr1[i][j]=n)+" ");
			}
			System.out.println();
		}//f
		
		
	}//m

}//c
