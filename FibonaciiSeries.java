package javaa;

public class FibonaciiSeries {
        
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int firstterm=0,secondterm=1, n=15,i;
     
     System.out.println("fibonaci series till "+n+"term:");
     
     for(i=1;i<=n;i++) {
    	 System.out.println(firstterm+" ,");
    	 
    	 
    	 int nextterm=firstterm+secondterm;
    	 firstterm=secondterm;
    	 secondterm=nextterm;
     }
	}

}
