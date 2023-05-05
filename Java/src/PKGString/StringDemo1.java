package PKGString;

public class StringDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1="abc";
		String str2=new String("abc");
		String str3="abc";
		
		if(str1.equals(str2))
		{
			System.out.println("text3");
		}
		else
		{
			System.out.println("Wrong text3");
		}
		if(str1==str3)
		{
		    System.out.println("text2");
		}
		else
		{
			System.out.println("Wrong text2");
		}
		

	}

}
