package by.htp.home02.main;

/*27. Найти max{min(a, b), min(c, d)}.*/

public class Task27 {

    public static void main(String[] args) {
	int a = 3;
	int b = 9;

	int c = 8;
	int d = 4;

	System.out.println(Math.max(Math.min(a, b), Math.min(c, d)));
    }
}
