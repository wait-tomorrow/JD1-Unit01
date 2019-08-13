package by.htp.home02.main;

/*5. Составить программу: определения наименьшего из двух чисел а и b.*/

public class Task05 {

    public static void main(String[] args) {
	int a = 5;
	int b = 7;

	if (a < b) {
	    System.out.println("Наименьшее число: " + a);
	} else if (b < a) {
	    System.out.println("Наименьшее число: " + b);
	} else {
	    System.out.println("Введенные числа равны");
	}
    }
}
