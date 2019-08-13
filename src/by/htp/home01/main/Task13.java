package by.htp.home01.main;

/*
 * 13. Заданы координаты трех вершин 
 * треугольника(х1у2),(х2, у2)),(х3, у3).Найти его периметр и площадь
 * */

public class Task13 {

    public static void main(String[] args) {
	double x1 = 1; // A
	double y1 = 1;

	double x2 = 3; // B
	double y2 = 1;

	double x3 = 1; // C
	double y3 = 3;

	double ab = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	double bc = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
	double ac = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));

	double p = ab + bc + ac;
	double pp = p / 2; // полупериметр
	double s = Math.sqrt(pp * (pp - ab) * (pp - bc) * (pp - ac)); // s = sqrt(p(p-a)*(p-b)*(p-c))

	System.out.println("Периметр: " + p);
	System.out.println("Площадь: " + s);
    }
}
