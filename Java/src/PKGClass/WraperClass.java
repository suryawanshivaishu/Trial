package PKGClass;

public class WraperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=23;
		//Wrapper class-it is used to represents the primitive data as object
		Integer a=new Integer(67);
		
		//unboxing-convert object to primitive
		int y=a.intValue();
		
		//boxing- convert primitive to object
		a=new Integer(x);
		
		//autoboxing-convert primitive to obejet
		Integer b=12;
		
		//autounboxing-convert object to primitive
		int z=b;
		
		String str="234";
		int r=Integer.parseInt(str);
		r=r+10;
		System.out.println(r);
		
		
		
		

	}

}
