package by.htp.home03.main;

import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * 28. Написать программу, в которой вводятся два операнда Х и Y 
 * и знак операции (+, –, /, *). 
 * Вычислить результат Z в зависимости от знака. 
 * Предусмотреть реакции на возможный неверный 
 * знак операции, а также на ввод Y=0 при делении. 
 * Организовать возможность многократных вычислений без перезагрузки 
 * программа (т.е. построить цикл). 
 * В качестве символа прекращения вычислений принять ‘0’. 
 */

public class Task28 {

    public static void main(String[] args) {
	Scanner sc = new Scanner(new InputStreamReader(System.in));

	while (true) {
	    System.out.print("Введите значение X (или 0 для выхода из программы): ");
	    int x = sc.nextInt();

	    if (x == 0) {
		System.out.println("Bye!");
		break;
	    }

	    System.out.print("Введите знак операции (+, -, /, *): ");
	    char zn = sc.next().charAt(0);

	    System.out.print("Введите значение Y: ");
	    int y = sc.nextInt();

	    switch (zn) {
	    case '+':
		System.out.println(x + y);
		break;

	    case '-':
		System.out.println(x - y);
		break;

	    case '*':
		System.out.println(x * y);
		break;

	    case '/':
		if (y != 0) {
		    System.out.println(x / y);
		} else {
		    System.out.println("Деление на 0!");
		}
		break;

	    default:
		System.out.println("Неверный знак операции!");
		break;
	    }
	}

	sc.close();
    }
}
