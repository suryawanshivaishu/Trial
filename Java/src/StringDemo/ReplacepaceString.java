package StringDemo;

import java.util.Scanner;

public class ReplacepaceString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner sc=new Scanner(System.in);
		String str="vaishu is the Best";
		char[] c=str.toCharArray();
	     StringBuffer sb=new StringBuffer();
	     
		for(int i=0;i<c.length;i++)
		{
	
			if((c[i]!=' ')&&(c[i]!='\t'))
			{
				sb.append(c[i]);
			}
			
		}
		System.out.println("String after removing spaces:"+sb);

	}

}
