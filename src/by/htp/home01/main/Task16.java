package by.htp.home01.main;

/*16. Найти произведение цифр заданного четырехзначного числа.*/

public class Task16 {

    public static void main(String[] args) {
	int x = 1234;
	int res = 1;

	for (int i = 1; i < 5; i++) {
	    res = res * (x % 10);
	    x = x / 10;
	}

	System.out.println(res);
    }
}
