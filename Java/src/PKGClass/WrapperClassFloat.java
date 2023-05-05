package PKGClass;

public class WrapperClassFloat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float x=45.0f;
		//Wrapper class-it is used to represents the primitive data as object
		Float a=new Float(35.f);
		
		
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
		System.out.println(x);
		

	}

}
