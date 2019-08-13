package by.htp.home03.main;

/*16. Вычислить: (1+2)*(1+2+3)*...*(1+2+...+10).*/

public class Task16 {

    public static void main(String[] args) {
	long result = 1;

	for (int i = 2; i <= 10; i++) {

	    long x = 0;
	    for (int j = 1; j < i + 1; j++) {
		x = x + j;
	    }

	    result = result * x;
	}

	System.out.println(result);
    }
}
