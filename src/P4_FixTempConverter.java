/*
	ISYS 320
	Name(s): Harrison Hawk and Ryan Tolan-hoechst
	Date: 09/27/17
*/

/*
 What were the errors you found?
  The ftoc was acting as a method and not a function so it wasn't returning a value.
  The tempc was not being updated with the new value in the main method.
  
  We changed the void to a double to change the method into a function.
 
 */

public class P4_FixTempConverter {
	public static void main(String[] args) {
		double tempf = 98.6;
		double tempc = 0.0;
		tempc = ftoc(tempf, tempc);
		System.out.println("Body temp in C is: " + tempc);
	}

	// converts Fahrenheit temperatures to Celsius
	public static double ftoc(double tempf, double tempc) {
	      tempc = (tempf - 32) * 5 / 9;
	      return  tempc;
    }
}
