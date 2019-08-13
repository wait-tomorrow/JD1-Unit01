package by.htp.home03.main;

/* 35. Найдите количество четных цифр данного натурального числа*/

public class Task35 {

    public static void main(String[] args) {
	int a = 123456788;
	int countChet = 0;

	while (a > 0) {
	    if ((a % 10) % 2 == 0) {
		countChet++;
	    }

	    a = a / 10;
	}

	System.out.println("Количество чётных цифр: " + countChet);
    }
}
