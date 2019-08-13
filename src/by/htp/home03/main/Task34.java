package by.htp.home03.main;

/* 
 * 34. Найдите все четырехзначные числа, 
 * сумма цифр каждого из которых равна 15.
 * */

public class Task34 {

    public static void main(String[] args) {

	for (int i = 1000; i <= 9999; i++) {
	    int x = i;
	    int sum = 0;

	    while (x > 0) {
		sum = sum + x % 10;

		x = x / 10;
	    }

	    if (sum == 15) {
		System.out.println(i);
	    }
	}
    }
}
