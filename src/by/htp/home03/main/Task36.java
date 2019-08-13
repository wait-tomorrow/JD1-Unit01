package by.htp.home03.main;

/*
 * 36. Два двузначных числа, записанных одно за другим, 
 * образуют четырёхзначное число, которое делится 
 * на их произведение. Найти эти числа.
 * 
 * Ответ: 13+52 и 17+34
 * */

public class Task36 {

    public static void main(String[] args) {

	for (int i = 10; i <= 99; i++) {
	    for (int j = 10; j <= 99; j++) {
		int x = i * 100 + j;

		if ((x % (i * j) == 0)) {
		    System.out.println(i + " " + j);
		}
	    }
	}
    }
}
