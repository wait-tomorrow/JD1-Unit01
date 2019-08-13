package by.htp.home02.main;

import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * 33. Написать программу, которая по паролю будет 
 * определять уровень доступа сотрудника к 
 * секретной информации в базе данных. 
 * Доступ к базе имеют только шесть человек, 
 * разбитых на три группы по степени доступа. 
 * Они имеют следующие пароли: 
 * 9583, 1747 —доступны модули баз А, В, С; 
 * 3331, 7922 —доступны модули баз В, С; 
 * 9455, 8997 —доступен модуль базы С.
 * */

public class Task33 {

    public static void main(String[] args) {
	Scanner sc = new Scanner(new InputStreamReader(System.in));
	int pass = sc.nextInt();

	if (pass == 9583 || pass == 1747) {
	    System.out.println("Access granted! (A,B,C)");
	} else if (pass == 3331 || pass == 7922) {
	    System.out.println("Access granted! (B,C)");
	} else if (pass == 9455 || pass == 8997) {
	    System.out.println("Access granted! (C)");
	} else {
	    System.out.println("Access denied!");
	}
	
	sc.close();
    }
}
