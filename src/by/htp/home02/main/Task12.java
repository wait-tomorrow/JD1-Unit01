package by.htp.home02.main;

/*
 * 12. Даны три действительных числа. 
 * Возвести в квадрат те из них, значения которых неотрицательны, 
 * и в четвертую степень — отрицательные
 * */

public class Task12 {

    public static void main(String[] args) {
	double a = 1.5;
	double b = -3.5;
	double c = -5;

	System.out.println("Число " + a + " => " + calculateDegree(a));
	System.out.println("Число " + b + " => " + calculateDegree(b));
	System.out.println("Число " + c + " => " + calculateDegree(c));
    }

    public static double calculateDegree(double x) {
	if (x < 0) {
	    return Math.pow(x, 4);
	} else {
	    return Math.pow(x, 2);
	}
    }
}
