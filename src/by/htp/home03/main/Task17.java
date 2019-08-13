package by.htp.home03.main;

/*17. Даны действительное (а) и натуральное (n). вычислить: a(a+1)...(a+n-1) */

public class Task17 {

    public static void main(String[] args) {
	double a = 1.0;
	int n = 3;

	double sum = a;

	for (int i = 1; i <= n; i++) {
	    sum = sum * (a + i);
	}

	System.out.println(sum);
    }
}
