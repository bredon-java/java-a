package city;

public class city   {
	
String city_name="bobbili";

int city_population=200000;

int city_street=500;


void city_details() {
	System.out.println("city name "+city_name);
	System.out.println("city populatio n"+city_population);
	System.out.println("city street "+city_street);

}
public  static void main (String[]args) {
	  city c=new city();
	  c.city_details();
	
	
}
}

