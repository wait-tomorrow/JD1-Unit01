package by.htp.home03.main;

/*
 * 39. В трехзначном числе зачеркнули старшую цифру. 
 * Когда полученное число умножили на 7, то получили исходное число. 
 * Найти это число.
 * 
 * Ответ: 350
 * */

public class Task39 {

    public static void main(String[] args) {
	for (int i = 100; i <= 999; i++) {
	    int x = i - (i / 100) * 100;

	    if (x * 7 == i) {
		System.out.println(i);
	    }
	}
    }
}
