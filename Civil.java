/**
 * 
 */
package ok;

/**
 * @author Admin
 *
 */
public class Civil extends Department {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Civil c=new Civil();
		int c1=c.dep_details();
		System.out.println("department is "+c1);
		System.out.println("department is "+dep_name);
		
		
		
		// TODO Auto-generated method stub

	}

	@Override
	int dep_details() {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	void dep_id_details() {
		// TODO Auto-generated method stub
		
	}

}
