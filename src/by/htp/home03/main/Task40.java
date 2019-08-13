package by.htp.home03.main;

/*
 * 40. Получить все числа, не превышающие заданного числа N, 
 * которые делятся без остатка на все свои цифры.
 * */

public class Task40 {

    public static void main(String[] args) {
	int n = 1000;

	for (int i = 10; i <= n; i++) {
	    int x = i;
	    boolean thatNumber = false;

	    while (x > 0) {

		if (x % 10 == 0) {
		    thatNumber = false;
		    break;
		}

		if (i % (x % 10) == 0) {
		    thatNumber = true;
		} else {
		    thatNumber = false;
		    break;
		}

		x = x / 10;
	    }

	    if (thatNumber) {
		System.out.println(i);
	    }
	}
    }
}
