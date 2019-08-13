package by.htp.home02.main;

/*
 * 31. Заданы размеры А, В прямоугольного отверстия и 
 * размеры х,у,z кирпича. Определить, пройдет ли 
 * кирпич через отверстие.
 * */

public class Task31 {

    public static void main(String[] args) {
	int a = 150;
	int b = 80;

	int x = 250;
	int y = 120;
	int z = 65;

	if (((a >= x) && (b >= y)) || ((a >= y) && (b >= x)) 
		|| ((a >= x) && (b >= z)) || ((a >= z) && (b >= x))
		|| (((a >= z) && (b >= y)) || ((a >= y) && (b >= z)))) {
	    System.out.println("Кирпич проходит в отверстие");
	} else {
	    System.out.println("Кирпич НЕ проходит в отверстие");
	}
    }
}
