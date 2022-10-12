/**
 * 
 */
package oops;


public class Switchexample {
  static int day=5;

	public static void main(String[] args) {
	
		
			switch(day) {
					case 1 :
			System.out.println("sunday");
			break;
					case 4:
						System.out.println("wed");
						break;
					case 3 :
						System.out.println("tues");
						break;
					case 2 :	
						System.out.println("thurs");
						break;
					case 5 :
						System.out.println("fri");
						break;
					case 7 :
						System.out.println("sat");
						break;
					case 6 :
						System.out.println("mon");
						break;
			default:
				
				System.out.println("defind");	
		}
	}
}
