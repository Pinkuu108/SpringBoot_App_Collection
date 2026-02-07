package Interview_Related_Code;

class car {
	String brand;
	int year;
}

public class Example1 {
	public static void main(String[] args) {

		car c = new car();
		c.brand = "toyota";
		c.year = 2021;

		String bb = "toyota";
		int yy = 2021;

		if (bb.equals(c.brand) && yy == c.year) {
			System.out.println("car brand is::" + bb);
			System.out.println("year is::" + yy);
		}
	}

}
