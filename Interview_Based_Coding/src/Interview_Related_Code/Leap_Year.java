package Interview_Related_Code;

public class Leap_Year {
	public static void main(String[] args) {
		int year=2028;
		
		if(year%400==0 ||(year%4==0&&year%100!=0))
		{
			System.out.println("Leap_Year.main()");
		}
		else
		{
			System.out.println("Not A Leap_Year.main()");
		}
	}

}
