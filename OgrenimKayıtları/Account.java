import java.util.Scanner;

public class Account {
	
	private double balance;
	private String ownerName;
	
	public Account() {
		
	}
	
	public Account(String name , double balance) {
		
		this.balance= balance;
		this.ownerName = name;
		
	}
	
	public void setOwnerName(String name) {
		
		this.ownerName=name;
		
	}
	
	public String getOwnerName() {
		
		return this.ownerName;
		
	}
	
	public void add(double amount) {
		
		this.balance = balance+amount;
		
	}
	
	public void withdraw(double amount) {
		
		int sifre = 1234;
		Scanner input = new Scanner(System.in);
		int girilenSifre,hak=3;
		
		while(true) {
			
			System.out.println("please enter the 4-digits pass : ");
			girilenSifre = input.nextInt();
			
			if(girilenSifre == sifre) {
				
				this.balance = this.balance - amount;
				return;
				
			}else {
				
				hak--;
				if(hak==0) {
					
					System.out.println("your account has been blocked. please try again");
					return;
					
				}
			}
			
			
		}
		
	}
	
	public double getBalance() {
		
		return this.balance;
		
	}
	
	
	

}
