import java.util.Scanner;
class SalesmanEMain
{
  public static void main(String [] args)
  {
	  SalesmanE s1=new SalesmanE();
	  int s1Id=s1.getId();
	  String s1Name=s1.getName();
	  float s1Salary=s1.getSalary();
	  float s1Intencive=s1.getIncentive();
	  System.out.println( "id ="+s1Id);
	  System.out.println("name ="+s1Name);
	  System.out.println("salary ="+s1Salary);
	  System.out.println("incentive ="+s1Intencive);
	  s1.setId(33);
	  s1.setName("Aasha");
	  s1.setSalary(6750.0f);
	  s1.setIncentive(34200.f);
	  s1.display();
  }
}