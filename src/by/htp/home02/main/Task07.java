package by.htp.home02.main;

/*
 * 7. Составить программу нахождения модуля выражения 
 * a*x*x + b*x + c при заданных значениях a, b, c и х
 * */

public class Task07 {

    public static void main(String[] args) {
	int a = 1;
	int b = 2;
	int c = 3;
	int x = 4;

	double z = a * Math.pow(x, 2) + b * x + c;

	if (z < 0) {
	    z = z * -1;
	}

	System.out.println(z);
    }
}
