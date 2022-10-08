package partens.java.com;

public class Even_number_Parten {

	public static void main(String[] args) {
		int k=20;
		for(int i=1;i<=k;i++) {
			if(!(i%2==0)) {
				for( int j=k-1;j>=i;j--) {
			
				System.out.print(" ");
				}
			
				for(int  j=1;j<=i;j++) {
					
					System.out.print(i+" ");
				}
				System.out.println();
			}
		}
		// TODO Auto-generated method stub

	}}


