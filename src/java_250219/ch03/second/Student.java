package java_250219.ch03.second;

public class Student extends People {
	
	public int studentNo;
	
	public Student(String name, String ssn, int stedentNo) {
		this.name = name;
		this.ssn = ssn;
		this.studentNo = stedentNo;
	}
	
	public Student(String name, String ssn) {
		super(name, ssn);
	}
	
	public Student() {
		
	}
}
