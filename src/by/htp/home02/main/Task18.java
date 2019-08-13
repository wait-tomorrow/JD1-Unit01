package by.htp.home02.main;

/*18. Подсчитать количество отрицательных среди чисел а, b, с*/

public class Task18 {

    public static void main(String[] args) {
	int a = -1;
	int b = -5;
	int c = 3;

	int negative = checkNumber(a) + checkNumber(b) + checkNumber(c);

	System.out.println("Количество отрицательных чисел: " + negative);
    }

    private static int checkNumber(int a) {
	if (a < 0) {
	    return 1;
	} else {
	    return 0;
	}
    }
}
