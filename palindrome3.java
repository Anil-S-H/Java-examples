package palindrome;

import java.util.Scanner;

public class palindrome3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num : ");
		int n=sc.nextInt();
		isPalindrome(n);
	}

	private static void isPalindrome(int n) {
		int i,sum=0,rem;
		int temp=n;
		while(n>0) {
			rem=n%10;
			sum=(sum*10)+rem;
			n=n/10;
		}
		if(temp==sum) {
			System.out.println("palindrome");
		}else {
			System.out.println("not a palindrome");
		}
	}
}
