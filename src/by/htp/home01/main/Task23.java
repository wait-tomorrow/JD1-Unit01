package by.htp.home01.main;

/*23. Найти площадь кольца, внутренний радиус которого равен r, а внешний - R (R > r). */

public class Task23 {

    public static void main(String[] args) {
	double r = 10;
	double R = 12;

	double s = Math.PI * (R * R - r * r);

	System.out.println("Площадь кольца = " + s);
    }
}
