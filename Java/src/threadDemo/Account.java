package threadDemo;

public class Account implements Runnable {
	
	int balance;
	
	public Account(int balance) {
		this.balance=balance;
	}
	public void withdraw(int amount)
	{
		System.out.println("\n before withdraw="+balance);
		balance=balance-amount;
		System.out.println("after withdraw="+balance);
	}
	public void deposite(int amount)
	{
		System.out.println("\n before deposite="+balance);
		balance=balance+amount;
		System.out.println("after deposite="+balance);
	}
	
	public void transection()
	{
		for(int i=0;i<10;i++) {
			if(Thread.currentThread().getName().equals("t1"))
				withdraw(1000);
			if(Thread.currentThread().getName().equals("t2"))
				deposite(1000);
		}
	}
	
	
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
	
		transection();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
