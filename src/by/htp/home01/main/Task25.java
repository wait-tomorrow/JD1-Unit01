package by.htp.home01.main;

/*
 * 25. Вычислить корни квадратного уравнения ах2+ bх + с = 0 
 * с заданными коэффициентами a, b и с 
 * (предполагается, что а≠0 и что дискриминант уравнения неотрицателен).
 * */

public class Task25 {

    public static void main(String[] args) {
	double a = 1;
	double b = -2;
	double c = -3; // x^2 - 2x - 3 = 0

	double D = b * b - 4 * a * c; // b^2-4ac

	double x1 = (-b + Math.sqrt(D)) / 2 * a;
	double x2 = (-b - Math.sqrt(D)) / 2 * a;

	System.out.println("x1 = " + x1);
	System.out.println("x2 = " + x2);
    }

}
