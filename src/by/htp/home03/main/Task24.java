package by.htp.home03.main;

/*
 * 24. Вводится натуральное число. 
 * Найти сумму четных цифр, входящих в его состав. 
 * Преобразовать его в другое число, цифры которого будут 
 * следовать в обратном порядке по сравнению с введенным числом. 
 */

public class Task24 {

    public static void main(String[] args) {
	int number = 123456;
	int inversedNumber = 0;
	int backUpNumber = number;

	int sumChet = 0;
	int razr = 1;

	while (number > 0) {
	    if ((number % 10) % 2 == 0) {
		sumChet = sumChet + (number % 10);
	    }

	    razr = razr * 10;
	    number = number / 10;
	}

	for (int i = razr / 10; i > 0; i = i / 10) {
	    inversedNumber = inversedNumber + (backUpNumber % 10) * i;
	    backUpNumber = backUpNumber / 10;
	}

	System.out.println("Сумма: " + sumChet);
	System.out.println("Инвертированное число: " + inversedNumber);
    }
}
