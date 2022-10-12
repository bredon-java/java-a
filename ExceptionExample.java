package Rummy;

public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=22;
int b=0;
int c=0;

try {
	
	c=a/b;
}catch(ArithmeticException t) {
	
	System.out.println("the value is 000");
	
}
System.out.println("c value is "+c);
	}}


