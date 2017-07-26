package tr.org.linux.kamp.StudentException;

public class Student {
	
	public static String name;
	public static String number;
	public static int grade;
	
	
	
	public  void gradeControl(int grade){
		try{
			if(grade<0 || grade>100) 
				throw new StudentEx();
			else
				this.grade=grade;
		}
		catch(StudentEx e) {
			System.out.println(e.gradeMessage());
		}
		}

		
	public void idControl(String number) {
		try {
			if(number.length()!=11)
				throw new StudentEx();
			else
				this.number=number;
		}
		catch(StudentEx e){
			System.out.println(e.idMessage());
		}
	}
}

