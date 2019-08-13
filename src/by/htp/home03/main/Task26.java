package by.htp.home03.main;

/*
 * 26. Вывести на экран соответствий между символами 
 * и их численными обозначениями в памяти компьютера 
 * (Таблицу ASCII). 
 */

public class Task26 {

    public static void main(String[] args) {
	for (int i = 33; i < 127; i++) {
	    System.out.println((char) i + " (" + i + ")");
	}
    }
}
