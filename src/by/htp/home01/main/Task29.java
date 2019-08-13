package by.htp.home01.main;

/*29. Найти (в радианах в градусах) все углы треугольника со сторонами а, b, с*/

public class Task29 {

    public static void main(String[] args) {
	double a = 5;
	double b = 7;
	double c = 8;

	double radAC = Math.acos((Math.pow(a, 2) + Math.pow(c, 2) - Math.pow(b, 2)) / (2 * a * c));
	double radAB = Math.acos((Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) / (2 * a * b));
	double radBC = Math.acos((Math.pow(b, 2) + Math.pow(c, 2) - Math.pow(a, 2)) / (2 * c * b));

	double gradAC = radAC * 180 / Math.PI;
	double gradAB = radAB * 180 / Math.PI;
	double gradBC = radBC * 180 / Math.PI;

	System.out.println("Углы в радианах:");
	System.out.println("AC: " + radAC + "  AB: " + radAB + "  BC: " + radBC);
	System.out.println("=======");
	System.out.println("Углы в градусах:");
	System.out.println("AC: " + gradAC + "  AB: " + gradAB + "  BC: " + gradBC);
    }
}
