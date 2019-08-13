package by.htp.home02.main;

import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * 23. Определить правильность даты, 
 * введенной с клавиатуры (число — от 1 до 31, месяц — от 1 до 12). 
 * Если введены некорректные данные, то сообщить об этом. 
 * */

public class Task23 {

    public static void main(String[] args) {
	Scanner console = new Scanner(new InputStreamReader(System.in));

	System.out.print("Введите месяц: ");
	int month = console.nextInt();
	;

	System.out.print("Введите число: ");
	int day = console.nextInt();

	boolean errFlag = false;

	if (1 > month || month > 12) {
	    errFlag = true;
	}

	if (day < 1 || day > 31) {
	    errFlag = true;
	}

	if (!errFlag) {
	    switch (month) {
	    case 1:
		errFlag = day <= 31 ? false : true;
		break;
	    case 2:
		errFlag = day <= 28 ? false : true;
		break;
	    case 3:
		errFlag = day <= 31 ? false : true;
		break;
	    case 4:
		errFlag = day <= 30 ? false : true;
		break;
	    case 5:
		errFlag = day <= 31 ? false : true;
		break;
	    case 6:
		errFlag = day <= 30 ? false : true;
		break;
	    case 7:
		errFlag = day <= 31 ? false : true;
		break;
	    case 8:
		errFlag = day <= 31 ? false : true;
		break;
	    case 9:
		errFlag = day <= 30 ? false : true;
		break;
	    case 10:
		errFlag = day <= 31 ? false : true;
		break;
	    case 11:
		errFlag = day <= 30 ? false : true;
		break;
	    case 12:
		errFlag = day <= 31 ? false : true;
		break;
	    }
	}

	if (errFlag) {
	    System.out.println("Проверьте введённые данные!");
	} else {
	    System.out.println("Заданное число есть в заданном месяце");
	}

	console.close();
    }
}
