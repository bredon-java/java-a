package javaa;

public class PrimeNumber {	
	public static void main(String[] args) {

		 int count = 0 ;
		int n=11;
		int i;
		
		for(i=1;i<=n;i++);		
		{
			if(n%i==0) {
				
				count =count+1;
				
			}
		}
	
	  if(count==2) 
	  {
    	  System.out.println("prime number"); 
    	  }
	  else {
    	  System.out.println("not prime number");
	  
	
      }
}

	public void checkprimenumber(int i, int j) {
		// TODO Auto-generated method stub
		
	}
}
