package StringDemo;

import java.util.Scanner;

public class VowelsCharAt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//count total no of vowels from given string
		
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		str=sc.nextLine();
		int count=0;
		for(int i=0;i<=str.length()-1;i++)
		{
			char ch=str.charAt(i);
			if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='z'||ch=='Z')
			{
				count++;
			}
		}
		System.out.println("Total no of vowels are:"+count);

	}

}
