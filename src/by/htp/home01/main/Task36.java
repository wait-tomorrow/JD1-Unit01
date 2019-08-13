package by.htp.home01.main;

/*
 * 36. Найти частное произведений четных 
 * и нечетных цифр четырехзначного числа
 * */

public class Task36 {

    public static void main(String[] args) {
	int a = 5234;

	int chet = 1;
	int nechet = 1;

	for (int i = 0; i < 4; i++) {

	    if ((a % 10) % 2 == 0) {
		chet = chet * (a % 10);
	    } else {
		nechet = nechet * (a % 10);
	    }
	    a = a / 10;
	}

	System.out.println("Произведение чётных: " + chet);
	System.out.println("Произведение нечётных: " + nechet);
	System.out.println("Частное произведений: " + (nechet / (double) chet));
    }
}
