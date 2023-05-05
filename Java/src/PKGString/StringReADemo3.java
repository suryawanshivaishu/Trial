package PKGString;

public class StringReADemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1="abcdef";
		String str2=new String("Welcome");
		
		char [] ar=str1.toCharArray();
		
		for(int i=str1.length()-1; i>=0; i--)
		{
			System.out.println(str1.charAt(i));
		}
		System.out.println("\n\n original array:");
		
		System.out.println(ar);

	}

	}

