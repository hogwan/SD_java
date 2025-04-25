package chapter07;

public class CompanyMain {
	public static void main(String[] args)
	{
		Company_05 company1 = new Company_05();
		Company_05 company2 = new Company_05();
		
		System.out.println(company1);
		System.out.println(company2);
		
		System.out.println("---------------singleton-------------------");
		
		//data 영역에 객체 생성
		Company_05 mycompany1 = Company_05.getInstance();
		Company_05 mycompany2 = Company_05.getInstance();
		
		System.out.println(mycompany1);
		System.out.println(mycompany2);
	}
}
