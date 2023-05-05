package StringDemo;

import java.util.Scanner;

public class CompareToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 string");
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		if(s1.compareTo(s2)==0)
			System.out.println("both are equlas");
		else if(s1.compareTo(s2)>0)
			System.out.println(s1+"greater than "+s2);
		else
			System.out.println("s2>s1");

	}

}
