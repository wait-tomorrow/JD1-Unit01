package by.htp.home03.main;

import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * 27. Для каждого натурального числа в промежутке 
 * от m до n вывести все делители, кроме единицы и 
 * самого числа. m и n вводятся с клавиатуры. 
 */

public class Task27 {

    public static void main(String[] args) {
	Scanner sc = new Scanner(new InputStreamReader(System.in));

	int m = sc.nextInt();
	int n = sc.nextInt();

	if (m > n) {
	    int x = n;
	    n = m;
	    m = x;
	}

	for (int i = m; i <= n; i++) {
	    for (int j = 2; j < i; j++) {
		if (i % j == 0) {
		    System.out.println(j + " является делителем числа " + i);
		}
	    }
	}
	
	sc.close();
    }
}
