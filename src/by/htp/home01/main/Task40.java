package by.htp.home01.main;

/*
 * 40. Дано значение х. 
 * Получить значения  
 * -2х + 3х^2 - 4х^3 и 1 + 2х + 3х^2 + 4х^3.
 * Позаботьтесь об экономии операций.
 * */

public class Task40 {

    public static void main(String[] args) {
	int x = 5;

	int x2 = x * x;
	int x3 = x2 * x;

	int a = -2 * x + 3 * x2 - 4 * x3;
	int b = 1 + 2 * x + 3 * x2 + 4 * x3;

	System.out.println(a); // -435
	System.out.println(b); // 586
    }
}
