package by.htp.home03.main;

import java.io.InputStreamReader;
import java.util.Scanner;

/* 6. Напишите программу, где пользователь вводит любое целое 
 * положительное число. А  программа суммирует все числа 
 * от 1 до введенного пользователем числа.*/

public class Task06 {

    public static void main(String[] args) {
	Scanner sc = new Scanner(new InputStreamReader(System.in));

	int a = sc.nextInt();
	int sum = 0;

	for (int i = 0; i <= a; i++) {
	    sum = sum + i;
	}

	System.out.println(sum);
	sc.close();
    }
}
