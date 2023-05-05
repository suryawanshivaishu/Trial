package StringDemo;

import java.util.Scanner;

public class AllCharAtExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		str=sc.next();                        //dynamic
		/*for(int i=0;i<str.length();i++)
		{
			System.out.println("Char at "+i+" place "+str.charAt(i));
		}*/
		
		// print all even position character from given string
		
	/*	for(int i=1;i<str.length();i=i+2)
		{
			System.out.println("Char at "+i+" place "+str.charAt(i));
		} */
		
		//print all odd posiion character from given string
		
		for(int i=0;i<str.length();i=i+2)
		{
			System.out.println("Char at "+i+" place "+str.charAt(i));
			
			
		
		}

	}

}
