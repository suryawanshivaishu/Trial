import java.lang.*;
import java.util.Scanner;
class CircleE
{
  private float radius;
  private float area;
  final float PI=3.142f;
  public CircleE()
  {
       radius=1.0f;
  }
  public CircleE(float radius)
  {
	  this.radius=radius;
  }
  public void display()
  {
	  System.out.println("Radius ="+radius);
  }
 public void setRadius(float radius)
  {
	  this.radius=radius;
  } 
  public float getRadius()
  {
	  return radius;
   }	   
}
	 