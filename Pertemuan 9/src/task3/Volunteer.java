package task3;

//*************************
// Volunteer.java	Author: Lewis/Loftus
//
// Respresents a Staff member that works a volunteer.
//*************************

public class Volunteer extends StaffMember {
	//-------------------------
	// Sets up a vlunteer using the specified information
	//-------------------------
	public Volunteer (String eName, String eAddress, String ePhone) {
		super (eName, eAddress, ePhone);
	}
	
	//-------------------------
	// Returns a zero pay value for this volunteer
	//-------------------------
	public double pay() {
		return 0.0;
	}

}
