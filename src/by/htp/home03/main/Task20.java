package by.htp.home03.main;

/*
 * 20. Даны числовой ряд и некоторое число е. 
 * Найти сумму тех членов ряда, модуль которых больше или равен заданному е. 
 * Общий член ряда имеет вид: 
 * an = 1 / ((3n-2)(3n+1))
 */

public class Task20 {

    public static void main(String[] args) {
	double sum = 0;
	double e = 0.01;

	double term = 0;
	int i = 0;

	do {
	    sum = sum + term;

	    i++;
	    term = Math.abs(1.0 / ((3.0 * i - 2.0) * (3.0 * i + 1.0)));
	} while (term >= e);

	System.out.println(sum);
    }
}
