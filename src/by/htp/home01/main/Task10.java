package by.htp.home01.main;

/*10. Вычислить значение выражения по формуле (все переменные принимают действительные значения)*/

public class Task10 {

    public static void main(String[] args) {
	double x = 0.5; // 28 гр.
	double y = 0.3; // 17 гр

	double r = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);

	System.out.println(r);
    }
}
