package by.htp.home01.main;

/*14. Вычислить длину окружности и площадь круга одного и того же заданного радиуса R. */

public class Task14 {

    public static void main(String[] args) {
	double r = 10;

	double c = 2 * Math.PI * r;
	double p = Math.PI * Math.pow(r, 2);

	System.out.println("Длина окружности = " + c);
	System.out.println("Площадь круга = " + p);
    }
}
