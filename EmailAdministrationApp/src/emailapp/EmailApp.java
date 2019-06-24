package emailapp;

public class EmailApp {

	public static void main(String[] args) {
			
		Email em1 = new Email("aftab","alam");
		
		System.out.println(em1.getMailBoxCapacity());
		//em1.changePassword("newPass");
		System.out.println(em1.getPassword());
		System.out.println(em1.getInfo());

	}

}
