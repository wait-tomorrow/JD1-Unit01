package by.htp.home03.main;

import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

/*
 * 31. Компьютер генерирует пять чисел в диапазоне от 1 до 15 включительно. 
 * Человек пытается их угадать. 
 * Программа должна выводить угаданные и неугаданные числа из тех, 
 * что сгенерировала программа, а также ошибочные числа пользователя. 
 * */

public class Task31 {

    public static void main(String[] args) {
	Random rand = new Random(System.currentTimeMillis());
	Scanner sc = new Scanner(new InputStreamReader(System.in));

	int randomNumbers[] = new int[5];
	int userNumbers[] = new int[5];

	int lastIndex = 0;

	while (lastIndex < 5) {
	    int x = rand.nextInt(16);

	    if (isUniqueNumber(randomNumbers, x)) {
		randomNumbers[lastIndex] = x;

		lastIndex++;
	    }
	}

	lastIndex = 0;
	while (lastIndex < 5) {
	    System.out.print("> ");
	    int x = sc.nextInt();

	    if (isUniqueNumber(userNumbers, x)) {
		userNumbers[lastIndex] = x;
		lastIndex++;
	    } else {
		System.out.println("Такое число уже было! Введите уникальное число");
	    }
	}

	System.out.println("---------------------");
	System.out.println("Случайные числа: ");
	for (int i = 0; i < 5; i++) {
	    System.out.print(randomNumbers[i] + "  ");
	}

	System.out.println("\nЧисла пользователя: ");
	for (int i = 0; i < 5; i++) {
	    System.out.print(userNumbers[i] + "  ");
	}

	System.out.println("\nУгаданные числа: ");
	for (int i = 0; i < 5; i++) {
	    for (int j = 0; j < 5; j++) {
		if (userNumbers[i] == randomNumbers[j]) {
		    System.out.print(userNumbers[i] + " ");
		}
	    }
	}

	sc.close();
    }

    private static boolean isUniqueNumber(int[] array, int number) {

	for (int i = 0; i < array.length; i++) {
	    if (array[i] == number) {
		return false;
	    }
	}
	return true;
    }
}
