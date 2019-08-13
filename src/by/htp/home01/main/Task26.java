package by.htp.home01.main;

/*
 * 26. Найти площадь треугольника, две стороны которого равны а и b, 
 * а угол между этими сторонами у.
 * */

public class Task26 {

    public static void main(String[] args) {
	double a = 5;
	double b = 7;
	double y = 0.6108; // 35 градусов

	double s = a * b * Math.sin(y) / 2;

	System.out.println(s);
    }
}
