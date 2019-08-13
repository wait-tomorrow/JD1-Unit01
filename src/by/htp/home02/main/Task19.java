package by.htp.home02.main;

/* 19. Подсчитать количество положительных среди чисел а, b, с.*/

public class Task19 {

    public static void main(String[] args) {
	int a = -1;
	int b = 9;
	int c = -5;

	int positive = checkNumber(a) + checkNumber(b) + checkNumber(c);

	System.out.println("Количество положительных чисел: " + positive);
    }
    
    private static int checkNumber(int a) {
	if (a > 0) {
	    return 1;
	} else {
	    return 0;
	}
    }
}
