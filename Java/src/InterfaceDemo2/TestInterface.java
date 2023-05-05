package InterfaceDemo2;

public class TestInterface {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestInterface1 t3=new TestInterface1();
		
		// this is upcasting(converting child to parent type)
		Movable t1=t3;
		Printable t2=t3;
		
		t1.move(120);
        String str=t2.print();
        System.out.println(str);
        
        t3.show();
	}

}
