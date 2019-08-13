package by.htp.home03.main;

/*11. Составить программу нахождения разности кубов первых двухсот чисел*/

public class Task11 {

    public static void main(String[] args) {
	long x = 0;

	for (int i = 1; i <= 200; i++) {
	    x = x - (long) Math.pow(i, 3);
	}

	System.out.println(x);
    }
}
