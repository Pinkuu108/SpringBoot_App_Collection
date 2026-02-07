package Stram_Api_BY_RabiSir;

class sample {
	public sample() {
		System.out.println("No arg Constructor");
	}
	public sample(String s) {
		System.out.println("sample.sample()"+s);
	}

}

interface pinku {
	public sample get(String s);
}

public class Constructor_Reference1 {

	public static void main(String[] args) {
      pinku p=sample::new;
      p.get("pinku");// this is one approch 
      sample s=p.get("chinu");//this is second approch
      //if 2 constructor is there like one i arg constructor and 2nd one is noarg constructr
      //it willcall always no arg ,our compiler never confused 
	}

}
