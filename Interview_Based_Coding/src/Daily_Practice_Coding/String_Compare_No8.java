package Daily_Practice_Coding;

public class String_Compare_No8 {
	public static void main(String[] args) {
        String s=("     pinkuna prusty    ");
        String s2=("Pinkuna Prusty");
        
        System.out.println(s.equalsIgnoreCase(s2));
        
        System.out.println(s.length());
        System.out.println(s.charAt(6));
        
        System.out.println(s.indexOf("p"));
        System.out.println(s.indexOf("p", s.indexOf("p")+1));
        System.out.println(s.trim());
	}

}
