import java.util.*;
public class Person {
	String first_name,middle_name,last_name;
	String DOB,address;
	String PAN;
	long aadhaar;
	
	public void getdata()
	{
		Scanner scanner = new Scanner(System.in);
		try {
		System.out.println("Enter your first name");
		first_name = scanner.next();
		System.out.println("Enter your middle name");
	    middle_name = scanner.next();
		System.out.println("Enter your last name");
		last_name = scanner.next();
		System.out.println("Enter your address");
		address = scanner.next();
		System.out.println("Enter your date of birth in DD/MM/YYYY");
		DOB = scanner.next();
		System.out.println("Enter your aadhaar number");
		aadhaar = scanner.nextLong();
		System.out.println("Enter your PAN number");
		PAN = scanner.next();
		}
		catch(Exception e)
		{
			System.out.println("Exception is handled");
			e.printStackTrace();
		}
	}
//	public void display()
//	{
//	String	name = first_name+middle_name+last_name;
//	System.out.println(name + "\n" + DOB + "\n" + address + "\n" + aadhaar + "\n" + PAN);
//	}

}
