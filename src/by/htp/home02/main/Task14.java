package by.htp.home02.main;

/*
 * 14. Даны два угла треугольника (в градусах). 
 * Определить, существует ли такой треугольник, 
 * и если да, то будет ли он прямоугольным.
 * */

public class Task14 {

    public static void main(String[] args) {
	int a = 90;
	int b = 45;

	int c = 180 - a - b;

	if (c > 0) {

	    if (a == 90 || b == 90 || c == 90) {
		System.out.println("Треугольник прямоугольный");
	    } else {
		System.out.println("Треугольник не прямоугольный");
	    }

	} else {
	    System.out.println("Такой треугольник не существует");
	}
    }
}
