package by.htp.home02.main;

/*
 * 17. Даны целые числа m, n. 
 * Если числа не равны, то заменить каждое из них 
 * одним и тем же числом, равным большему из исходных, 
 * а если равны, то заменить числа нулями
 * */

public class Task17 {

    public static void main(String[] args) {
	int m = 4;
	int n = 3;

	if (m == n) {
	    m = 0;
	    n = 0;
	} else {
	    if (m > n) {
		n = m;
	    } else {
		m = n;
	    }
	}
	System.out.println("m: " + m + "\nn: " + n);
    }
}
