package Interview_Related_Code;

public class Remove_Space_FromString {

	public static void main(String[] args) {
    
		String s1="pinkuna    prusty    ";
		
		s1=s1.replace("\\s+", "");
		System.out.println(s1);
	}

}
