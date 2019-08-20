package by.htp.home03.main;

import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * 32. Проверить введенную пользователем строку на наличие недопустимых символов. 
 * В качестве первого символа допустимы только буквы и знак подчеркивания. 
 * Остальные символы могут быть буквами, цифрами и знаком подчеркивания. 
 * */

public class Task32 {

    public static void main(String[] args) {
	String allowedFirst = "ABCDEFGHIJKLMNOPQRSTUVWXYZ_";
	String allowedAll = "ABCDEFGHIJKLMNOPQRSTUVWXYZ_0123456789";
	boolean isAllowedString = true;
	Scanner sc = new Scanner(new InputStreamReader(System.in));

	String userString = sc.next();
	//String userString = "AbcdE";
	userString = userString.toUpperCase();

	for (int i = 0; i < userString.length(); i++) {
	    if (i == 0) {
		isAllowedString = allowedFirst.contains(userString.substring(i, i + 1));
	    } else {
		isAllowedString = allowedAll.contains(userString.substring(i, i + 1));
	    }
	    if (!isAllowedString) {
		break;
	    }
	}

	if (!isAllowedString) {
	    System.out.println("Строка содержит запрещённые символы!");
	} else {
	    System.out.println("Строка НЕ содержит запрещённые символы");
	}

	sc.close();
    }
}
