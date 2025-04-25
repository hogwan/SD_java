package chapter06;

public class TeamMember_05 {
	public String teamName;
	public String mName;
	public String mPhone;
	public String sName;
	public String name;
	public String gender;
	
	public TeamMember_05() {
		
	}
	
	public TeamMember_05(String name, String gender)
	{
		mName = name;
		this.gender =gender;
	}
	
	
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public String getmPhone() {
		return mPhone;
	}
	public void setmPhone(String mPhone) {
		this.mPhone = mPhone;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	//기본 생성자
	
	//getter / setter
	
}
