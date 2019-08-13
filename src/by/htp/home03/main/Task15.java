package by.htp.home03.main;

/*15.Вычислить : 1+2+4+8+...+ 2 в 10 степени.*/

public class Task15 {

    public static void main(String[] args) {
	int a = 1;
	int sum = 0;

	while (a <= Math.pow(2, 10)) {
	    sum = sum + a;
	    a = a * 2;
	}

	System.out.println(sum);
    }
}
