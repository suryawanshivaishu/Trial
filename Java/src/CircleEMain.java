import java.lang.*;
import java.util.Scanner;
class CircleEMain
{
	public static void main(String [] args)
	{
		CircleE c1=new CircleE(4.1f);
        float c1Radius=c1.getRadius();
		System.out.println("radius ="+c1Radius);
	     c1.setRadius(3.1f);
		 c1.display();
	}
}