package PKGClass;

public class WraperClassDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double x=45.0f;
		//Wrapper class-it is used to represents the primitive data as object
		Double a=new Double(56.0f);
		
		
		//unboxing-convert object to primitive
		double z=a.doubleValue();
		System.out.println(a.doubleValue());
		
		
		//boxing- convert primitive to object
		a=new Double(34.0f);
		System.out.println(a);
		
		//autoboxing-convert primitive to obejet
		Double c=56.;
		System.out.println();
		
		//autounboxing-convert object to primitive
		double b=a;
		System.out.println(a);
		
		String str="45.0f";
		double r=Double.parseDouble(str);
		x=r+10;
		System.out.println(x);
		

	}

	}

