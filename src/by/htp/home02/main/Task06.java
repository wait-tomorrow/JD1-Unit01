package by.htp.home02.main;

/* 6. Составить программу: определения наибольшего из двух чисел а и b. */

public class Task06 {

    public static void main(String[] args) {
	int a = 5;
	int b = 7;

	if (a > b) {
	    System.out.println("Наибольшее число: " + a);
	} else if (b > a) {
	    System.out.println("Наибольшее число: " + b);
	} else {
	    System.out.println("Введенные числа равны");
	}
    }
}
