package by.htp.home02.main;

/*
 * 9. Составить программу, которая определит 
 * по трем введенным сторонам, является ли  
 * данный треугольник равносторонним.
 * */

public class Task09 {

    public static void main(String[] args) {
	int a = 3;
	int b = 3;
	int c = 2;

	if (a == b && b == c) {
	    System.out.println("Данный треугольник является равносторонним");
	} else {
	    System.out.println("Данный треугольник не является равносторонним");
	}
    }
}
