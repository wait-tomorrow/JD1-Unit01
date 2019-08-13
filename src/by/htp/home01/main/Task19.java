package by.htp.home01.main;

/*
 * 19. Дана сторона равностороннего треугольника. 
 * Найти площадь этого треугольника, его высоту, 
 * радиусы вписанной и описанной окружностей.
 * */

public class Task19 {

    public static void main(String[] args) {
	double a = 5;

	double h = (Math.sqrt(3) / 2) * a;
	double s = a * h / 2;

	double rIn = a / (2 * Math.sqrt(3));
	double rOut = a / Math.sqrt(3);

	System.out.println("Площадь = " + s);
	System.out.println("Высота = " + h);
	System.out.println("Радиус вписанной окружности = " + rIn);
	System.out.println("Радиус описаннойокружности = " + rOut);
    }
}
