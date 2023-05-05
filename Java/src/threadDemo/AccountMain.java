package threadDemo;

public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account a1=new Account(10000);
		//Account a2=new Account(10000);
		
		Thread t1=new Thread(a1,"t1");
		Thread t2=new Thread(a1,"t2");
		
		t1.start();
		t2.start();

	}

}
