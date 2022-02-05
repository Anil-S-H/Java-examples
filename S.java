import java.util.Scanner;

public class S {
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		int choice,amount=0,cash,withdraw;
		
		while(true) {
		System.out.println("enter the choice :");
		System.out.println("1 : deposit mouney");
		System.out.println("2 : withdraw money");
		System.out.println("3 : check balance");
		System.out.println("4 : exit");
		
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("enter the amount to deposit :");
			cash=sc.nextInt();
			amount=amount+cash;
			System.out.println("amount deposited successfully!!");
			System.out.println(" ");
			break;
			
		case 2:
			System.out.println("enter the amount to withdraw :");
			withdraw=sc.nextInt();
			if(withdraw>amount) {
				System.out.println("amount is less...");
				break;
			}
			amount=amount-withdraw;
			System.out.println("amount withdrawn successfully!!");
			System.out.println(" ");
			break;
		
		case 3:
			System.out.println("Balance is :"+amount);
			System.out.println(" ");
			break;
			
		case 4:
			System.out.println("Thank you!!! use again.....");
			System.out.println("*****-----------------------******");
			System.exit(0);
		}
	}
	}
}
