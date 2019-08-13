package by.htp.home01.main;

import java.io.IOException;

/*
 * 33. Ввести любой символ и определить его порядковый номер, 
 * а также указать предыдущий и последующий символы.
 * */

public class Task33 {

    public static void main(String[] args) throws IOException {
	int c = System.in.read();

	System.out.println("Текущий символ");
	System.out.println("Код символа: " + c + "| Символ: " + (char) c);
	System.out.println("======");

	System.out.println("Следующий символ");
	System.out.println("Код символа: " + (c + 1) + "| Символ: " + (char) (c + 1));
	System.out.println("======");

	System.out.println("Предыдущий символ");
	System.out.println("Код символа: " + (c - 1) + "| Символ: " + (char) (c - 1));
	System.out.println("======");
    }
}
