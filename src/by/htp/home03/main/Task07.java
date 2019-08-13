package by.htp.home03.main;

/* 7. Вычислить значения функции на отрезке [а,b] c шагом h:*/

public class Task07 {

    public static void main(String[] args) {
	int h = 1;

	int a = -5;
	int b = 5;

	for (int x = a; x <= b; x = x + h) {
	    if (x > 2) {
		System.out.println("y(" + x + ") = " + x);
	    } else {
		System.out.println("y(" + x + ") = " + (-x));
	    }
	}
    }
}
