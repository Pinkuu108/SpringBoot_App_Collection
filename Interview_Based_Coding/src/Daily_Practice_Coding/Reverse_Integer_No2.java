package Daily_Practice_Coding;

public class Reverse_Integer_No2 {
	public static void main(String[] args) {
		
		//Reverse String Using While Loop
		int i=123;
		int num;
		int rev=0;
		while(i!=0) 
		{
			num=i%10;
			rev=rev*10+num;
			i=i/10;
		}
		System.out.println("Reverse_Integer.main()::"+rev);
		
		//USing StringBuffer
//		long l=12345;
//		System.out.println(new StringBuffer(String.valueOf(l)).reverse());
		
		
	}

}
