import java.lang.*;
import java.util.Scanner;
class SalesmanE
{
 private int id;
 private String name;
 private float salary;
 private float incentive;
  public SalesmanE()
  {
	  id=231;
	  name="vaishu";
	  salary=80000.f;
	  incentive=4500.f;
  }
 public void setSalesmanE(int id, String name, float salary, float incentive)
  {
	  this.id=id;
	  this.name=name;
	  this.salary=salary;
	  this.incentive=incentive;
  }
  public void display()
  {
	  System.out.println("Salesman id:"+id);
	  System.out.println("Salesman name:"+name);
	  System.out.println("Salesman salary:"+salary);
	  System.out.println("Salesman incentive:"+incentive);
  }
  public void setId(int id)
  {
	  this.id=id;
  }
  public void setName(String name)
  {
	  this.name=name;
  }
  public void setSalary(float salary)
  {
	  this.salary=salary;
  }
  public void setIncentive(float incentive)
  {
	  this.incentive=incentive;
  }
 public int getId()
 {
	 return id;
  }
  public String getName()
  {
	  return name;
  }
  public float getSalary()
  {
	  return salary;
  }
  public float getIncentive()
  {
	  return incentive;
  }
}
  
	  
  
