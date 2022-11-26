import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankingSystem bs = new BankingSystem();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to State Bank of India:)");
		System.out.println("How can we assist you today?");
		System.out.println("1. Create an account:");
		System.out.println("2. Deposit money");
		System.out.println("3. Withdraw money");
		System.out.println("4. Transfer money");
		System.out.println("5. Exit");
		int choice = scanner.nextInt();
		
		switch(choice)
		{
		case 1:
			bs.getdata();
			//bs.display();
			bs.create_account();
			break;
		case 2:
			bs.deposit(0, 0, 0);
			break;
		case 3:
			bs.withdraw(0, 0, 0);
			break;
		case 4:
			bs.transfer(0, 0);
			break;
		case 5:
			System.out.println("You have exited the portal");
		}

//bs.create_account();
//bs.deposit(0, 0, 0);
//bs.withdraw(0,0,0);
	}

}
