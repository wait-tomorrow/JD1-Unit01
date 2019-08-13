package by.htp.home01.main;

/*12. Вычислить расстояние между двумя точками с данными координатами (х1, у1)и (x2, у2)
 * 
 * Решение: sqrt((x2-x1)^2 + (y2-y1)^2)
 * */

public class Task12 {

    public static void main(String[] args) {
	// a(1,1) b(2,2)
	double x1 = 1;
	double y1 = 1;

	double x2 = 2;
	double y2 = 2;

	double r = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

	System.out.println(r);
    }
}
