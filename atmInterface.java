import java.util.Scanner;
public class atmInterface {

	private static int balance =1000;
	private static int transactionCount=0;
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter your user id: ");
		String user=sc.nextLine();
		
		System.out.println("Enter your user pin: ");
		int pin=sc.nextInt();
		
		
		if(user(user,pin))
		{
			int option;
			
			do {
				System.out.println("*******Welcome********");
				System.out.println("1.Transaction History");
				System.out.println("2.Withdrawl");
				System.out.println("3.Deposit");
				System.out.println("4.Transfer");
				System.out.println("5.Quit");
				System.out.println("Enter a option :");
				option=sc.nextInt();
				
				switch(option)
				{
				case 1:transactionHistory();break;
				case 2:withdrawl();break;
				case 3:deposit();break;
				case 4:transfer(); break;
				case 5:quit(); break;
				default:System.out.println("Invalid option");
				}
			}
			while(option!=0);
		}else
		{
			System.out.println("Enter a correct user and password");
			
		}
		
}

	private static boolean user(String user, int pin) {
		
		String user1="root";
		int pin1=1234;
		return user.equals(user1)&&pin==pin1;
	}

	private static void quit() {
		
		
		System.exit(0);
	}

	private static void transfer() {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter account no to transfer");
		String accNo=sc.next();
		
		System.out.println("Enter amount to transfer:");
		int amount=sc.nextInt();
		if(amount>0 && amount <=balance) {
			balance-=amount;
			transactionCount++;
			System.out.println(amount+" transfer successfully to account "+accNo+".");
		}
		else
		{
			System.out.println("Balance is insufficient");
		}
	}

	private static void deposit() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ammount to deposit:");
		int amount=sc.nextInt();
		if(amount>0) {
		balance+=amount;
		System.out.println(amount+" Deposited succesfully");
		}
		else
		{
			System.out.println("invaild ammount please try again");
		}
	}

	private static void withdrawl() {
		
		 Scanner input = new Scanner(System.in);
	        System.out.print("Enter amount to withdraw: ");
	        int amount = input.nextInt();
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            transactionCount++;
	            System.out.println(amount + " withdrawn successfully.");
	        } else {
	            System.out.println("Invalid amount. Please try again.");
	        }
	}

	private static void transactionHistory() {
		
		System.out.println("Transaction History: ");
		System.out.println("No of transaction: "+ transactionCount);
		System.out.println("Balance: "+balance);
		
	}

	
	
}
