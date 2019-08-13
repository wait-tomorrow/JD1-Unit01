package by.htp.home01.main;

/*
 * 27. Дано значение a. 
 * Не используя никаких функций и никаких операций, кроме умножения, 
 * получить значение а8 за три операции и а10 за четыре операции. 
 */

public class Task27 {

    public static void main(String[] args) {
	int a = 2;

	// при умножении степени складываются
	// a * a = a^2
	// a^2 * a^2 = a^4
	// a^4 * a^4 = a^8
	// a^8 * a^2 = a^10

	int a2 = a * a;
	int a4 = a2 * a2;
	int a8 = a4 * a4;
	int a10 = a2 * a8;

	System.out.println(a + " в степени 8: " + a8);
	System.out.println(a + " в степени 10: " + a10);
    }
}
