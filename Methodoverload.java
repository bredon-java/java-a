/**
 * 
 */
package All;


public class Methodoverload {

	int a,b,c,d;
	
	static int sum (int a,int b) {
	
		return a+b;
	}
	int sum (int a,int b,int c) {
		
		return a+b+c;
	}
	
	int sum (int a, int b,int c,int d) {
		
		return a+b+c+d;
	}
	public static void main(String[] args) {
		Methodoverload mtd =new Methodoverload();
		int sum1=mtd.sum (3,3);
		int sum2=mtd.sum(5,4,3);
		int sum3=mtd.sum(5,6,3,10);
		
		System.out.println("answer "+sum1);
		System.out.println("answer "+sum2);
		System.out.println("answer "+sum3);
		
		
		
	}

}
