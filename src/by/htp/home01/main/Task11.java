package by.htp.home01.main;

/*11. Вычислить периметр и площадь прямоугольного треугольника по длинам а и b двух катетов*/

public class Task11 {

    public static void main(String[] args) {
	double a = 5.5;
	double b = 4.8;

	double c = Math.sqrt(a * a + b * b); // c^2 = a^2 + b^2

	double s = a * b / 2;
	double p = a + b + c;

	System.out.println("Гипотенуза = " + c);
	System.out.println("Периметр = " + p);
	System.out.println("Площадь = " + s);
    }
}
