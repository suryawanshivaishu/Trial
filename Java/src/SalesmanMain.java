import java.util.Scanner;
class SalesmanMain
{
  public static void main(String [] args)
  {
	  Salesman salesman=new Salesman();
	  salesman.setSalesman(12,"vijay",2500,3000);
	  float Gross=salesman.CalGrossSal();
	  System.out.println("Gross="+Gross);
  }
}