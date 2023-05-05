package InterfaceDemo;

public class TestInterface {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Movable t1=new TestInterface1();
		Printable t2=new TestInterface2();
		t1.move(120);
		String str=t2.print();
		System.out.println(str);

	}

}
