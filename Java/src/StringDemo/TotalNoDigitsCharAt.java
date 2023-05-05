package StringDemo;

import java.util.Scanner;

public class TotalNoDigitsCharAt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//convert lowercase character into uppercase & viceversa
		// A=65 a=97 32+  a=97 A=65 32-
		
		String str;
		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		str=sc.nextLine();
		for(int i=0;i<=str.length()-1;i++)
		{
			ch=str.charAt(i);
			if(ch>='A'&&ch<='Z')
			{
				ch=(char)(ch+32);
				System.out.println(""+ch);
			}
			else if(ch>='a'&&ch<='z')
			{
				ch=(char)(ch-32);
				System.out.println(""+ch);
			}
		}
		
		

	}

}
