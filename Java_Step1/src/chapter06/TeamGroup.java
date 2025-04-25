package chapter06;

public class TeamGroup {
	private TeamMember_05[] member = new TeamMember_05[5];
	private TeamMember_05 m = new TeamMember_05();
	
	public void init() {
		member[0] = new TeamMember_05("신인철", "남학생");
		member[1] = new TeamMember_05("김관호", "남학생");
		member[2] = new TeamMember_05("김관호", "남학생");
		member[3] = new TeamMember_05("김관호", "남학생");
		member[4] = new TeamMember_05("김관호", "남학생");
	}
	
	public void Disp() {
		for(int i=0;i<member.length;i++)
		{
			System.out.print("성명: " + (member[i].getmName()));
			System.out.print(", 성별: " + (member[i].getGender()));
			System.out.println();
		}
	}
}
