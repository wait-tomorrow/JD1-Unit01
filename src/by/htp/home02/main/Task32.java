package by.htp.home02.main;

/*
 * 32. Написать программу, которая по заданным 
 * трем числам определяет, является ли сумма 
 * каких-либо двух из них положительной.
 * */

public class Task32 {

    public static void main(String[] args) {
	int a = 1;
	int b = -2;
	int c = 3;

	if (a + b > 0) {
	    System.out.println("Сумма a+b положительна");
	}

	if (a + c > 0) {
	    System.out.println("Сумма a+c положительна");
	}

	if (b + c > 0) {
	    System.out.println("Сумма b+c положительна");
	}
    }
}
