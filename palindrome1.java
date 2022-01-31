package palindrome;

import java.util.Scanner;

//using pankaj sir approach, i,j var
public class palindrome1 {

	public static void main(String[] args) {
		int counter=0,i,size,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String : ");
		String s=sc.next();
		size=s.length();
		j=s.length();
		for(i=0;i<size;i++) {
			if(s.charAt(i)==s.charAt(--j)) {
				counter++;
			}
		}
		if(counter==size) {
			System.out.println(s+" = is a paindrome");
		}else {
			System.out.println(s+" = is not a paindrome");
		}
	}
}
