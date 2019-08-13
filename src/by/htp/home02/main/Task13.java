package by.htp.home02.main;

/*
 * 13. Даны две точки А(х1, у1) и В(х2, у2). 
 * Составить алгоритм, определяющий, которая из точек 
 * находится ближе к началу координат.
 * */

public class Task13 {

    public static void main(String[] args) {
	int x1 = 1;
	int y1 = 1;

	int x2 = 2;
	int y2 = 2;

	double r1 = calculateDistance(x1, y1);
	double r2 = calculateDistance(x2, y2);

	if (r1 < r2) {
	    System.out.println("Первая точка ближе");
	} else if (r2 < r1) {
	    System.out.println("Вторая точка ближе");
	} else {
	    System.out.println("Обе точки на одинаковом расстоянии");
	}
    }

    public static double calculateDistance(int x, int y) {
	return Math.sqrt(x * x + y * y);
    }
}
