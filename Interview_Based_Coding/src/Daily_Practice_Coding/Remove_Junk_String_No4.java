package Daily_Practice_Coding;

public class Remove_Junk_String_No4 {
	public static void main(String[] args) {

		String s = ("@@@!#$%^& PINKUNA chinu");
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println("Remove_Junk_String.main()::" + s.toUpperCase());

	}
}
