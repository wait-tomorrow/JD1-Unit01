package by.htp.home03.main;

import java.math.BigInteger;

/* 10. Составить программу нахождения произведения 
 * квадратов первых двухсот чисел.
 * */

public class Task10 {

    public static void main(String[] args) {

	BigInteger x = BigInteger.valueOf(1);

	for (int i = 1; i <= 200; i++) {
	    x = x.multiply(BigInteger.valueOf(i * i));
	}

	System.out.println(x);
    }
}
