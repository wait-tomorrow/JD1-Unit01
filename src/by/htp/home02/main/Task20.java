package by.htp.home02.main;

/*20. Определить, делителем каких чисел а,b,с является число k*/

public class Task20 {

    public static void main(String[] args) {
	int a = 15;
	int b = 5;
	int c = 11;

	int k = 5;

	if (a % k == 0 || b % k == 0 || c % k == 0) {
	    checkDevisor(a, k);
	    checkDevisor(b, k);
	    checkDevisor(c, k);
	} else {
	    System.out.println("Число " + k + " не является делителем введенных чисел");
	}
    }

    public static void checkDevisor(int x, int k) {
	if (x % k == 0) {
	    System.out.println("Число " + k + " является делителем числа " + x);
	}
    }
}
