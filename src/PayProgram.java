
public class PayProgram {

	public static void main(String[] args) {
		System.out.print(computePay(4.00,11));

	}

	public static double computePay(double salary, int hours) {
		int regularHours = Math.min(8, hours);
		int overtimeHours = Math.max(0, hours - regularHours);
		double regularPay = salary *  regularHours;
		double overtimePay = 1.5 * salary * overtimeHours;
		double totalPay = regularPay + overtimePay;
		return totalPay;
	}
}
