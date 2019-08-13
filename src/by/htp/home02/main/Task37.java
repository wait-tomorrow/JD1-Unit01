package by.htp.home02.main;

/*37. Вычислить значение функции:*/

public class Task37 {

    public static void main(String[] args) {
	double x = 2.5;

	double y;

	if (x >= 3) {
	    y = -Math.pow(x, 2) + 3 * x + 9;
	} else {
	    y = 1 / (Math.pow(x, 3) - 6);
	}

	System.out.println(y);
    }

}
