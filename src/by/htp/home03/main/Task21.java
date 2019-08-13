package by.htp.home03.main;

/* 21. Составить программу для вычисления значений функции F(x) 
 * на отрезке [а, b] с шагом h. Результат представить в виде 
 * таблицы, первый столбец которой – значения  аргумента, 
 * второй - соответствующие значения функции: 
 * F(x) = x-sin(x)
 */

public class Task21 {

    public static void main(String[] args) {
	double a = -1;
	double b = 1;

	double h = 0.1;

	System.out.println("-------------------");
	System.out.println("|  x   |   y      |");
	System.out.println("-------------------");

	for (double i = a; i <= b; i = i + h) {
	    double x = i - Math.sin(i);
	    System.out.println("| " + Math.round(i * 1000) / 1000.0 + "    " + Math.round(x * 1000) / 1000.0 + "  |");
	}

	System.out.println("|-----------------|");
    }
}
