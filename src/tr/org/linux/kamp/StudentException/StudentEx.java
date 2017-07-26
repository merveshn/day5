package tr.org.linux.kamp.StudentException;

public class  StudentEx extends Exception{

	public String gradeMessage() {
		return "Grade cannot be lower than 0 or higher than 100.";
	}
	
	public String idMessage() {
		return "ID number cannot have other than 11 number.";
	}
}
