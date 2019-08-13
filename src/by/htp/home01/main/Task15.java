package by.htp.home01.main;

/*15. Написать программу, которая выводит на экран первые четыре степени числа π. */

public class Task15 {

    public static void main(String[] args) {
	
	for (int i = 1; i < 5; i++){
	    System.out.println(i + " степень числа π = " + Math.pow(Math.PI, i));
	}
	
    }
}
