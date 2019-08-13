package by.htp.home03.main;

/*
 * 18. Даны числовой ряд и некоторое число е. 
 * Найти сумму тех членов ряда, модуль которых больше 
 * или равен заданному е. Общий член ряда имеет вид: 
 * an = (-1)^n-1 / n
 * */

public class Task18 {

    public static void main(String[] args) {
	double sum = 0;
	double e = 0.1;

	double term = 0;
	int i = 0;

	do {
	    sum = sum + term;

	    i++;
	    term = Math.abs(Math.pow(-1, i - 1) / i);
	} while (term >= e);
	/*
	 * Ряд сходится к 0, значит нет смысла продолжать цикл, если значение члена ряда
	 * стало меньше е
	 */

	System.out.println(sum);
    }
}
