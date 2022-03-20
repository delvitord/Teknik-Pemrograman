package composistion;

public class Jurus {
	private String elemen;
	private String skill1;
	private String skill2;
	
	Jurus(){
	}
	
	Jurus(String elemen, String skill1, String skill2){
		this.elemen = elemen;
		this.skill1 = skill1;
		this.skill2 = skill2;
	}

	public String getElemen() {
		return elemen;
	}

	public void setElemen(String elemen) {
		this.elemen = elemen;
	}

	public String getSkill1() {
		return skill1;
	}

	public void setSkill1(String skill1) {
		this.skill1 = skill1;
	}

	public String getSkill2() {
		return skill2;
	}

	public void setSkill2(String skill2) {
		this.skill2 = skill2;
	}
}
