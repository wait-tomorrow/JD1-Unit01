package by.htp.home02.main;

/*
 * 28. Даны три числа a, b, с. 
 * Определить, какое из них равно d.
 * Если ни одно не равно d, 
 * то найти max(d—a, d—b, d—c).
 * */

public class Task28 {

    public static void main(String[] args) {
	int a = 1;
	int b = 2;
	int c = 3;

	int d = 10;
	int max = 0;

	if (a == d) {
	    System.out.println("a равно d");
	} else if (b == d) {
	    System.out.println("b равно d");
	} else if (c == d) {
	    System.out.println("c равно d");
	} else {
	    max = Math.max(d - a, d - b);
	    if (d - c > max) {
		max = d - c;
	    }

	    System.out.println("Найденное значение: " + max);
	}
    }
}
