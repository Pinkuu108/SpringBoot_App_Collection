package Array_Based;

public class Reverse_String_StringBuilder {

	public static void main(String[] args) {

		String s = "Wecome Pinku";
		StringBuilder str = new StringBuilder();
        for(int i=s.length()-1;i>=0;i--)
        {
        	str.append(s.charAt(i));
        }
        System.out.println(str);
	}
}
