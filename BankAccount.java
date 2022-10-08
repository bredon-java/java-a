package javaa;

public class BankAccount {
	   String acc_holder_name;
	   int age=18;
	   String acc_address;
	public void getElligibility (int age) {
 
			 
			 if(age<21)
				 System.out.println("age is not elligble use gardian help");
			 else
				 System.out.println("age is elligble");
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount b=new BankAccount();
	    b.getElligibility(21);

	}

}
