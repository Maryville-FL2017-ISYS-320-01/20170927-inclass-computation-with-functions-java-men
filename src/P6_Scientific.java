/*
	ISYS 320
	Name(s): Harrison Hawk and Ryan Tolan-hoechst
	Date:09/27/17
*/

public class P6_Scientific {

	public static void main(String[] args) {
		double base = 6.5;
		int baseExponent = 3;
		System.out.print(computeScientificValue(base, baseExponent));

	}
	
	public static double computeScientificValue(double base, int baseExponent) {
		double finalNumber = base * Math.pow(10, baseExponent);
		return finalNumber;
	
	}
}