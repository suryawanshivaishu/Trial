package InterfaceDemo;

public class TestInterface1 implements Movable {

	@Override
	public void move(int speed)
	{
		System.out.println("current speed is "+speed);
	}

}
