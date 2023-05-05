package PKGClass;

public class WrapperClassChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char x='a';
		//Wrapper class-it is used to represents the primitive data as object
		Char a=new Char();
		
		
		//unboxing-convert object to primitive
		float z=a.floatValue();
		
		
		//boxing- convert primitive to object
		a=new Float(a);
		
		//autoboxing-convert primitive to obejet
		Float b=48.f;
		
		//autounboxing-convert object to primitive
		float c=b;
		
		String str="45.0f";
		float r=Float.parseFloat(str);
		x=r+10;
		System.
	}

}
