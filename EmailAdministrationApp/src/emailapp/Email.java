package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailboxCapacity = 500;
	private int defaultPasswordLength = 10;
	private String alternateEmail;
	private String email;
	private String companySuffix = "aeycompany.com";

	// ask for the first name and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Email Created: " + this.firstName + " " + this.lastName);
		
		// ask for the department
		this.department= setDepartment();
		System.out.println("Department: " + this.department);
		
		//set password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println(this.password);
		
		//generate email
		this.email=generateEmail();
		System.out.println(this.email);
	}

	private String setDepartment() {
		System.out.println("DEPARTMENT CODES\n1 for Sales\n2 for Devolopment\n3 for Accounting\nEnter department code:");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if (depChoice == 1) {
			return "sales";
		} else if (depChoice == 2) {
			return "dev";
		} else if (depChoice == 3) {
			return "acct";
		} else
			return "";
	}

	
	// generate a random string for password
	
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!£$*#";
		char[] password = new char[length];
		for (int i=0; i<length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			//each time i increases from 0 to 10, sets a char from the array at the specified index
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	private String generateEmail() {
		String email = firstName.toLowerCase()+ "." + lastName.toLowerCase() +  "@" + department + "." + companySuffix;

		
		
		return email;
		
	}
	// set the mail box capacity
	
	public void setMailBoxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
		
	}
	
	//set alt email
	public void setAlternatemail(String altEmail) {
		this.alternateEmail=altEmail;
		
	}
	
	// ability to change the password
	public void changePassword(String password) {
		this.password= password;
	}
	
	public int getMailBoxCapacity() {
		return mailboxCapacity;
	}
	
	public String getAlternateEmail() {
		return alternateEmail;
	}
	
	public String getPassword() {
		return password;
		
	}
	public String getInfo() {
		String info = "Name: "+ firstName + lastName + "\nPassword: " + this.password + "\nEmail:" + this.email + "\nDepartment:" + this.department;
		
		return info;
		
	}
}
