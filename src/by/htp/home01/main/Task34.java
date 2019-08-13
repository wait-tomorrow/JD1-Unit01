package by.htp.home01.main;

/*
 * 34. Дана величина А, выражающая объем информации в байтах.
 * Перевести А в более крупные единицы измерения информации.
 * */

public class Task34 {

    public static void main(String[] args) {
	int bytes = 1100412857;

	double KB = bytes / 1024;
	double MB = KB / 1024;
	double GB = MB / 1024;

	System.out.println("bytes: " + bytes);
	System.out.println("KB: " + KB);
	System.out.println("MB: " + MB);
	System.out.println("GB: " + GB);
    }
}
