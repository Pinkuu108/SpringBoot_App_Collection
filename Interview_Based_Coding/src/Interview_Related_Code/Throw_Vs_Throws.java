package Interview_Related_Code;

class radiouException extends Exception {
	@Override
	public String toString() {
		return "Rdoious Can't be Negative";

	}

	@Override
	public String getMessage() {
		return "Radious Can't be Negative";
	}

}

public class Throw_Vs_Throws {

	public static Double getRdious(int r) throws radiouException {
		if (r < 0) {
			throw new radiouException();
		}
		double result = Math.PI * r * r;
		return result;
	}

	public static double getsum(int a, int b) throws ArithmeticException {
		int result = a / b;
		return result;
	}

	public static void main(String[] args) {

		try {
			double r = getRdious(-1);
			System.out.println(r);
//			double getsum = getsum(10, 0);
			// System.out.println(getsum);
		} catch (Exception e) {
			//System.out.println("All Exception Are Handled");
			System.out.println(e.getMessage());
		}
	}
}
