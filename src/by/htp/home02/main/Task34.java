package by.htp.home02.main;

import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * 34. Составить программу, реализующую эпизод применения 
 * компьютера в книжном магазине. Компьютер запрашивает 
 * стоимость книг, сумму денег, внесенную покупателем; 
 * если сдачи не требуется, печатает на экране «спасибо»; 
 * если денег внесено больше, чем необходимо, 
 * то печатает «возьмите сдачу» и указывает сумму 
 * сдачи; если денег недостаточно, то печатает сообщение 
 * об этом и указывает размер недостающей суммы.
 * */

public class Task34 {

    public static void main(String[] args) {
	Scanner sc = new Scanner(new InputStreamReader(System.in));

	System.out.print("Стоимость книг: ");
	int costOfBooks = sc.nextInt();

	System.out.print("Внесенная сумма: ");
	int cash = sc.nextInt();

	if (costOfBooks == cash) {
	    System.out.println("Спасибо!");
	} else if (costOfBooks > cash) {
	    System.out.println("Внесите ещё " + (costOfBooks - cash));
	} else {
	    System.out.println("Возьмите сдачу: " + (cash - costOfBooks));
	}

	sc.close();
    }
}
