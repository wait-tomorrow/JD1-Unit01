package by.htp.home01.main;

/*
 * 37. Составить линейную программу, печатающую значение true, 
 * если указанное высказывание является истинным, 
 * и false — в противном случае
 * */

public class Task37 {

    public static void main(String[] args) {
	/* Целое число N является четным двузначным числом. */
	int N = 86;

	if ((N > 9 && N < 100) && (N % 2 == 0)) {
	    System.out.println(true);
	} else {
	    System.out.println(false);
	}

	/*
	 * Сумма двух первых цифр заданного четырехзначного числа равна сумме двух его
	 * последних цифр
	 */
	int x = 6244;

	int s1 = (x % 10) + (x % 100 / 10);
	int s2 = (x / 1000) + (x / 100 % 10);

	if (s1 == s2) {
	    System.out.println(true);
	} else {
	    System.out.println(false);
	}

	/* Сумма цифр данного трехзначного числа N является четным числом. */
	N = 345;
	s1 = 0;

	for (int i = 0; i < 3; i++) {
	    s1 = s1 + N % 10;
	    N = N / 10;
	}

	if ((s1 % 2) == 0) {
	    System.out.println(true);
	} else {
	    System.out.println(false);
	}

	/*
	 * Точка с координатами (х, у) принадлежит части плоскости, лежащей между
	 * прямыми х= m, х= n (m<n).
	 */
	x = 3;

	int m = -5;
	int n = 10;

	if (m < x && x < n) {
	    System.out.println(true);
	} else {
	    System.out.println(false);
	}

	/*
	 * Квадрат заданного трехзначного числа равен кубу суммы цифр этого числа
	 */
	int r = 125;
	int s = 0;

	for (int i = 0; i < 3; i++) {
	    s = s + (r % 10);
	    r = r / 10;
	}

	if (r * r == s * s * s) {
	    System.out.println(true);
	} else {
	    System.out.println(false);
	}

	/* Треугольник со сторонами а,b,с является равнобедренным */
	int a = 4;
	int b = 5;
	int c = 5;

	if ((a == b && a != c) || (a == c && a != b) || (b == c && b != a)) {
	    System.out.println(true);
	} else {
	    System.out.println(false);
	}

	/*
	 * Сумма каких-либо двух цифр заданного трехзначного натурального числа N равна
	 * третьей цифре.
	 */
	N = 257;

	a = N / 100;
	b = N / 10 % 10;
	c = N % 10;

	if (a + b == c || a + c == b || b + c == a) {
	    System.out.println(true);
	} else {
	    System.out.println(false);
	}

	/*
	 * Заданное число N является степенью числа а (показатель степени может
	 * находиться в диапазоне от 0 до 4).
	 */
	N = 8;
	a = 2;

	checkNumber(N, a);

	/*
	 * График функции у = ах^2 + bх + с проходит через заданную точку с координатами
	 * (m, n)
	 */
	m = 2;
	n = 2;

	a = 1;
	b = 2;
	c = 3;

	if (n == (a * Math.pow(m, 2) + b * m + c)) {
	    System.out.println(true);
	} else {
	    System.out.println(false);
	}
    }

    public static void checkNumber(int N, int a) {
	for (int i = 0; i <= 4; i++) {
	    if (Math.pow(a, i) == N) {
		System.out.println(true);

		return;
	    }
	}
	System.out.println(false);
    }
}
