package Stram_Api_BY_RabiSir;

import java.util.function.BinaryOperator;

public class BinnaryOperatorDemo {

	public static void main(String[] args) {
		
		BinaryOperator<Integer> bi=(a,b)->a+b;
		System.out.println("sum os 2 Integer is "+bi.apply(20, 21));

	}

}
