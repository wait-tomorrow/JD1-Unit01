package by.htp.home02.main;

/* 26. Написать программу нахождения суммы большего и меньшего из трех чисел. */

public class Task26 {

    public static void main(String[] args) {
	int a = 8;
	int b = 7;
	int c = 3;

	int max = a;
	int min = a;

	if (b > max) {
	    max = b;
	}

	if (c > max) {
	    max = c;
	}

	if (b < min) {
	    min = b;
	}

	if (c < min) {
	    min = c;
	}

	System.out.println(max);
	System.out.println(min);
	System.out.println(max + min);
    }
}
