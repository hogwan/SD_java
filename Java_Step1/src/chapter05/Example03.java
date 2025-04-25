package chapter05;

public class Example03 {
	public static void main(String[] args)
	{
		int[] numbers = {7,2,9,1,5};
		int maxnum = findMax(numbers);
		System.out.println("최대값: " + maxnum);
	}
	
	// 최대값을 메소드로 구현
	public static int findMax(int[] nums)
	{
		int max = 0;
		for(int a : nums)
		{
			if(max < a) a = max;
		}
		
		return max;
	}
}
