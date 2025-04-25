package chapter06;

public class TeamMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TeamGroup group = new TeamGroup();
		group.init();
		group.Disp();
		System.out.println();
		//-------------------------
		TeamMember_05 t1 = new TeamMember_05();
		t1.setName("신인철");
		
		System.out.println("팀장이름: " + t1.getName());
		
		TeamMember_05 t2 = new TeamMember_05();
		t2.setName("김관호");
		
		System.out.println("부팀장이름: " + t2.getName());
	}

}
