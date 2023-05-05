import java.lang.*;
import java.util.Scanner;
class CircleMain
{
	public static void main(String [] args)
	{
		Circle c1=new Circle();
		Circle c2=new Circle(5.6f);
		c1.displayCircleInfo();
		c2.displayCircleInfo();
		float area=c2.calArea();
		System.out.println("Area ="+area);
	}
}