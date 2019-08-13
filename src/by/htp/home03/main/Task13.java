package by.htp.home03.main;

/* 13. Составить таблицу значений функции y= 5 -x2/2 
 * на отрезке [-5; 5] с шагом 0.5.
 * */

public class Task13 {

    public static void main(String[] args) {
	double h = 0.5;

	double a = -5;
	double b = 5;

	double y;

	for (double x = a; x <= b; x = x + h) {
	    y = 5 - Math.pow(x, 2) / 2;

	    System.out.println("y(" + x + ") = " + y);
	}
    }
}
