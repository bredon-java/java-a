package Lucky;

public class Fibonacci {

	public static void main(String[] args) {
		
		fabonacci(10);
		

	}

	private static void fabonacci(int n) {
		
		int a=0;
		
		int b=1;
		
		if(n>=1)
		System.out.println("0");
		
		//if(n>=2);
		System.out.println("1");
		
		for(int i=3;i<=n;i++) {
			
			int c =a+b;
			
			System.out.println(c+ " ");
			
			a=b;b=c;
			
			//b=c;
			
			
		}
		
	}

}
