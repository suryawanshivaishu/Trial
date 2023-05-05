package PKGString;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Dream big";
		//stores the reverse of given string
		String reverseStr="";
		
		//iterate through string from last and each character variable reversedStr
		for(int i=str.length()-1;i>0;i--)
		{
			reverseStr = reverseStr +str.charAt(i);
		}
		    System.out.println("Original string:"+str);
           System.out.println("Reverse of given String:"+reverseStr);
	}

}
