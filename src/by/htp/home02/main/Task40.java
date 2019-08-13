package by.htp.home02.main;

/*40. Вычислить значение функции:*/

public class Task40 {

    public static void main(String[] args) {
	double x = 5.0;

	double y;

	if (x <= 13) {
	    y = -Math.pow(x, 3) + 9;
	} else {
	    y = -3 / (x + 1);
	}

	System.out.println(y);
    }
}
