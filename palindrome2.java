package palindrome;

import java.util.Scanner;

//using decrementing for loop for String
public class palindrome2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String : ");
		String s=sc.next();
		isPalindrome(s);
	}
	private static void isPalindrome(String s) {
		String rev="";
		String org=s;
		int size=s.length();
		for(int i=size-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		if(org.equals(rev)) {
			System.out.println(s+"= it is palindrome");
		}else {
			System.out.println(s+"= it is not a palindrome");
		}
	}
}
