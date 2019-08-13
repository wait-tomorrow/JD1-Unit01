package by.htp.home01.main;

/*
 * 20. Известна длина окружности. 
 * Найти площадь круга, ограниченного этой окружностью.
 * */

public class Task20 {

    public static void main(String[] args) {
	double c = 10;

	double s = Math.pow(c, 2) / (4 * Math.PI);

	System.out.println("Площадь круга = " + s);
    }
}
