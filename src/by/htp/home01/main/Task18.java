package by.htp.home01.main;

/*
 * 18. Дана длина ребра куба. 
 * Найти площадь грани, площадь полной поверхности и объем этого куба.
 * */

public class Task18 {

    public static void main(String[] args) {
	double a = 4; // длина ребра

	double pGr = a * a;
	double pPov = 6 * pGr;
	double volume = Math.pow(a, 3);

	System.out.println("Площадь грани = " + pGr);
	System.out.println("Площадь полной поверхности = " + pPov);
	System.out.println("Объём куба = " + volume);
    }
}
