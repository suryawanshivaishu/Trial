package InterfaceDemo2;

public class TestInterface1 implements Movable,Printable{

	@Override
	public void move(int speed)
	{
		System.out.println("current speed is "+speed);
	}
	@Override
	public String print()
	{
		return "in TestInterface1 print";
	}
	public void show()
	{
		System.out.println("in show");
	}
}
