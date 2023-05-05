package StringDemo;

import java.util.Scanner;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="java";
		
		char ch[]={'s','t','r','i','n','g','s'};
		String s2=new String(ch);
		
		String s3=new String("example");
		
		String name;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		name=sc.next();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(name);
		
		
	}
	

}
