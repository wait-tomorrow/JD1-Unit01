package by.htp.home03.main;

/* 23. Составить программу для вычисления значений функции F(x) 
 * на отрезке [а, b] с шагом h. Результат представить в виде 
 * таблицы, первый столбец которой – значения  аргумента, 
 * второй - соответствующие значения функции: 
 * F(x) = ctg(x/3)+1/2sin(x)
 */

public class Task23 {

    public static void main(String[] args) {
	double a = -1;
	double b = 1;

	double h = 0.1;

	System.out.println("-------------------");
	System.out.println("|  x   |   y      |");
	System.out.println("-------------------");

	for (double i = a; i <= b; i = i + h) {
	    double cth = (1 / Math.tan(i / 3)) < 0.0001 ? 0 : (1 / Math.tan(i / 3));
	    double x = cth + (1 / 2 * Math.sin(i));
	    System.out.println("| " + Math.round(i * 1000) / 1000.0 + " |   " + Math.round(x * 1000) / 1000.0 + "   |");
	}

	System.out.println("|-----------------|");
    }
}
