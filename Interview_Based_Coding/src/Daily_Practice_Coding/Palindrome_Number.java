package Daily_Practice_Coding;

public class Palindrome_Number {
	public static void main(String[] args) {
		int num=123;
		int temp=num;
		int rev=0;
		while(num!=0) {
			int n=num%10;
			rev=rev*10+n;
			num=num/10;
		}
		if(temp==rev)
		{
			System.out.println("PalinDrome Number");
		}
		else
		{
			System.out.println("Not A PalinDrome Number");
		}
	}

}
