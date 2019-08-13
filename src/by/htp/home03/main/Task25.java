package by.htp.home03.main;

import java.io.InputStreamReader;
import java.util.Scanner;

/*25. Требуется определить факториал числа, которое ввел пользователь. */

public class Task25 {

    public static void main(String[] args) {
	Scanner sc = new Scanner(new InputStreamReader(System.in));
	int number = sc.nextInt();
	int factorial = 1;

	for (int i = 1; i <= number; i++) {
	    factorial = factorial * i;
	}

	System.out.println(factorial);

	sc.close();
    }
}
