/**
 * 
 */
package All;


public class Student1 extends College1 {
	
	String student_name="pavan";
	int student_ph_no=9999;
	int roll_no=002;
	
	void student_details() {
		
		System.out.println("name "+student_name);
		System.out.println("ph no "+student_ph_no);
		System.out.println("no "+roll_no);
	}
	public static void main(String[] args) {
		
		Student1 st=new Student1();
		st.student_details();
		
	}

}
