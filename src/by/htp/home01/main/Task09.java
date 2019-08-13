package by.htp.home01.main;

/* 9. Вычислить значение выражения по формуле (все переменные принимают действительные значения) */

public class Task09 {

    public static void main(String[] args) {
	double a = 3.5;
	double b = 4.2;
	double c = 9.8;
	double d = 1.7;

	double x = (a / c) * (b / d) - ((a * b - c) / (c * d));

	System.out.println(x);
    }
}
