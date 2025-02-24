package java_250219.ch04.third;

public class People {

	public static void main(String[] args) {
		User user = new User();
		user.showMyName();
		
		Admin admin = new Admin();
		admin.showMyName();
		
		// Member member = new Admin();
		Member member = new User();
		member.showMyName();
	}

}
