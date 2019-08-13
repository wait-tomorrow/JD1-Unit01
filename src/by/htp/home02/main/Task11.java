package by.htp.home02.main;

/*
 * 11. Составить программу, которая определит 
 * площадь какого треугольника больше.
 * */

public class Task11 {

    public static void main(String[] args) {
	int a1 = 3;
	int b1 = 4;
	int c1 = 5;

	int a2 = 6;
	int b2 = 2;
	int c2 = 5;

	double s1 = calculateArea(a1, b1, c1);
	double s2 = calculateArea(a2, b2, c2);

	if (s1 > s2) {
	    System.out.println("Первый треугольник больше");
	} else if (s1 > s2) {
	    System.out.println("Второй треугольник больше");
	} else {
	    System.out.println("Треугольники равны");
	}
    }

    public static double calculateArea(int a, int b, int c) {
	double p = calculatePerimeter(a, b, c);

	return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static double calculatePerimeter(int a, int b, int c) {
	return (a + b + c) / 2.0;
    }
}
