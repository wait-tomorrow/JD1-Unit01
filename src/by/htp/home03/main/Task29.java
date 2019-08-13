package by.htp.home03.main;

/*29. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа. */

public class Task29 {

    public static void main(String[] args) {
	int a = 12345;
	int b = 2595;

	if (b > a) {
	    int x = a;
	    a = b;
	    b = x;
	}

	while (a > 0) {
	    int a_ = a % 10;
	    int b_ = b;

	    while (b_ > 0) {
		if (b_ % 10 == a_) {
		    System.out.println("Цифра " + a_ + " входит в оба числа");
		    break;
		}
		b_ = b_ / 10;
	    }

	    a = a / 10;
	}
    }
}
