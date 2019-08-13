package by.htp.home02.main;

/*
 * 15. Даны действительные числа х и у, не равные друг другу. 
 * Меньшее из этих двух чисел заменить половиной их суммы, 
 * а большее — их удвоенным произведением.
 * */

public class Task15 {

    public static void main(String[] args) {
	double x = 1.5;
	double y = 4.2;

	double sum = (x + y) / 2;
	double umn = x * y * 2;

	if (x < y) {
	    x = sum;
	    y = umn;
	    System.out.println("x = " + x + "\ny = " + y);
	} else if (y < x) {
	    x = umn;
	    y = sum;
	    System.out.println("x = " + x + "\ny = " + y);
	} else {
	    System.out.println("Числа равны");
	}
    }
}
