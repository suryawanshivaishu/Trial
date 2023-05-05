import java.lang.*;
import java.util.Scanner;
class Circle
{
  float radius;
  final float PI=3.142f;
  Circle()
  {
	  radius=1.0f;
  }
  Circle(float radius)
  {
	  this.radius=radius;
  }
   float calArea()
   {
	   float area;
	   area=PI*radius*radius;
	 return area;
   }
   void displayCircleInfo()
   {
	   System.out.println("Radius ="+radius);
   }
   
}