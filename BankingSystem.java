import java.util.*;

public class BankingSystem extends Person
{
	
	long contact_no;
	String email;
	int mail_otp,phone_otp;
	int min=100000;
	int max=999999;
	String branch;
	double min_balance;
	int account_no = (int) (Math.random()*(max-min+1)+min);
	public void create_account()
	{
		Scanner scanner = new Scanner(System.in);
	
		
		try {
		System.out.println("Enter your preferred choice of branch");
		branch = scanner.next();
		
		
			System.out.println("Enter your e-mail address:");
			email = scanner.next();
			System.out.println("Enter the OTP");
			
			mail_otp=scanner.nextInt();
			
			System.out.println("Enter your phone number:");
			contact_no = scanner.nextLong();
			System.out.println("Enter the OTP:");
			phone_otp = scanner.nextInt();
		
	System.out.println("Welcome aboard!!!!!!");	
	System.out.println("-----------------------");

	String name = first_name+" " + middle_name + " " + last_name;
	System.out.println(name + "\n" + DOB + "\n" + address + "\n" + "Aadhaar:" + aadhaar + "\n" + "PAN:" + PAN + "\n" + "Branch:" + branch + "\n"  + contact_no + "\n" + email + "\n");
	System.out.println("This is your account number:" + "\n" + account_no);
	System.out.println("Enter the amount you would like to deposot as your first deposit");
	
		
	min_balance= scanner.nextDouble();
		System.out.println("This is your account balance:" + min_balance);
		} catch(Exception e)
		{
			System.out.println("Exception is handled");
			e.printStackTrace();
		}
			
			
			
			
			
		}
		public void deposit(int acc_no, double amount, double balance)
		{
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter your account number:");
			acc_no = scanner.nextInt();
			System.out.println("Enter the amount of money you would want to deposit");
			amount=scanner.nextDouble();
			System.out.println("Amount deposited successfully:");
			System.out.println("---------------------------------");
			
			
		}
		public void withdraw(int acc_no, double amount, double balance)
		{
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter your account number:");
			acc_no = scanner.nextInt();
			System.out.println("Enter the amount of money you would want to withdraw");
			amount=scanner.nextDouble();
			System.out.println("Amount deposited successfully:");
			System.out.println("---------------------------------");
			
			
		}
		public void transfer(int rec_acc_no, double amm) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the account number of the receiver");
			rec_acc_no = scanner.nextInt();
			System.out.println("Enter the amount you want to transfer");
			amm = scanner.nextDouble();
			
		}
		
		
}




