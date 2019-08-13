package by.htp.home01.main;

/*
 * 17. Даны два числа. 
 * Найти среднее арифметическое кубов этих чисел 
 * и среднее геометрическое модулей этих чисел
 * */

public class Task17 {

    public static void main(String[] args) {
	double a = 2;
	double b = 3;

	double srA = (Math.pow(a, 3) + Math.pow(b, 3)) / 2;

	double srG = Math.sqrt(a * b);

	System.out.println("Среднее арифметическое = " + srA);
	System.out.println("Среднее геометрическое = " + srG);
    }
}
