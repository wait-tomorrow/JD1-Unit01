package by.htp.home01.main;

/*8. Вычислить значение выражения по формуле 
(все переменные принимают действительные значения): 
𝑏 + √𝑏2 + 4𝑎𝑐 2𝑎 − 𝑎3𝑐 + 𝑏−2 */

public class Task08 {
    public static void main(String[] args) {
	double a = 5;
	double b = 3;
	double c = 2;

	double x = ((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a)) - Math.pow(a, 3) * c + Math.pow(b, -2);

	System.out.println(x);
    }
}
