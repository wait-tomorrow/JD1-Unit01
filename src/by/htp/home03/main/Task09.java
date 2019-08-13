package by.htp.home03.main;

/* 9. Найти сумму квадратов первых ста чисел.*/

public class Task09 {

    public static void main(String[] args) {
	int x = 0;

	for (int i = 0; i <= 100; i++) {
	    x = x + i * i;
	}

	System.out.println(x);
    }
}
