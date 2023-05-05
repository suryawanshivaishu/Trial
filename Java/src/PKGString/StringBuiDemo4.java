package PKGString;

public class StringBuiDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1="abcdef";
		String str2=new String("abc");
		
		str1="abcDef";
		
		StringBuilder str3=new StringBuilder("abcdef");
		System.out.println(str3);
		
		str3.setCharAt(3, 'D');
		System.out.println(str3);

	}

}
