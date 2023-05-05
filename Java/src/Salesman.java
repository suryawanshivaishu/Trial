import java.lang.*;
import java.util.Scanner;
class Salesman
{
  int id;
  String name;
  float salary;
  float incentive;
  void acceptSalesmanData()
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter id:");
	  id=sc.nextInt();
	  System.out.println("Enter name:");
	  name=sc.nextLine();
	  System.out.println("Enter salary:");
	  salary=sc.nextFloat();
	  System.out.println("Enter incentive:");
	  incentive=sc.nextFloat();
  }
  void displaySalesmanData()
  {
	  System.out.println("Salesman id:"+id);
	  System.out.println("Salesman name:"+name);
	  System.out.println("Salesman salary:"+salary);
	  System.out.println("Salesman incentive:"+incentive);
  }
  void setSalesman(int id, String name, float salary, float incentive)
  {
	  this.id=id;
	  this.name=name;
	  this.salary=salary;
	  this.incentive=incentive;
  }
  float CalGrossSal()
  {
	  float Gross;
	  Gross=salary+incentive;
	  return Gross;
  }
}
  
	  
  
