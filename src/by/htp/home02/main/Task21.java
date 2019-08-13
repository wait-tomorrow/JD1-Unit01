package by.htp.home02.main;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * 21. Программа — льстец. 
 * На экране высвечивается вопрос «Кто ты: мальчик или девочка? 
 * Введи Д или М». 
 * В зависимости от ответа на экране должен появиться текст 
 * «Мне нравятся девочки!» или «Мне нравятся мальчики!».
 * */

public class Task21 {

    public static void main(String[] args) throws IOException {
	boolean oneMore = true;

	while (oneMore) {
	    System.out.println("Кто ты: мальчик или девочка? Введи 'Д' или 'М'");

	    Scanner console = new Scanner(new InputStreamReader(System.in, "UTF-8"));
	    String answer = console.nextLine();

	    if (!answer.equals("Д") && !answer.equals("М")) {
		System.out.println("Я твоя не понимай! Попробуем ещё раз...");
	    } else {
		
		if (answer.equals("Д")) {
		    System.out.println("Мне нравятся девочки!");
		} else{
		    System.out.println("Мне нравятся мальчики!");
		}
		
		oneMore = false;
		console.close();
	    }
	}
	
    }
}
