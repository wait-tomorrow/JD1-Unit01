package by.htp.home03.main;

/* 8. Вычислить значения функции на отрезке [а,b] c шагом h*/

public class Task08 {

    public static void main(String[] args) {
	int a = 10;
	int b = 20;
	int c = 2;

	int h = 1;

	for (int x = a; x <= b; x = x + h) {
	    if (x != 15) {
		System.out.println("y(" + x + ") = " + ((x - c) + 6));
	    } else {
		System.out.println("y(" + x + ") = " + ((x + c) * 2));
	    }
	}
    }
}
