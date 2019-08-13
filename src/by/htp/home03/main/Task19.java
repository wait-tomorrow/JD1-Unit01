package by.htp.home03.main;

/*
 * 19. Даны числовой ряд и некоторое число е. 
 * Найти сумму тех членов ряда, модуль которых больше или равен заданному е. 
 * Общий член ряда имеет вид: 
 * an = 1/2^n + 1/3^n
 * */

public class Task19 {

    public static void main(String[] args) {
	double sum = 0;
	double e = 0.1;

	double term = 0;
	int i = 0;

	do {
	    sum = sum + term;

	    i++;
	    term = Math.abs(1 / Math.pow(2, i) + i / Math.pow(3, i));
	} while (term >= e);
	/*
	 * Ряд сходится к 0, значит нет смысла продолжать цикл, если значение члена ряда
	 * стало меньше е
	 */

	System.out.println(sum);
    }
}
