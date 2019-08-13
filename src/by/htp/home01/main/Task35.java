package by.htp.home01.main;

/*
 * 35. Даны натуральные числа М и N. 
 * Вывести старшую цифру дробной части 
 * и младшую цифру целой части числа M/N.
 * */

public class Task35 {

    public static void main(String[] args) {
	int M = 12345;
	int N = 89;

	double x = M / (double) N;

	int maxDrob = (int) ((x - (int) x) * 10);
	int minCel = (int) (x % 10);

	System.out.println("Число: " + x);
	System.out.println("Старшая цифра дробной части: " + maxDrob);
	System.out.println("Младшая цифра целой части: " + minCel);
    }
}
