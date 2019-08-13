package by.htp.home01.main;

/*
 * 39. Дано действительное число х. 
 * Не пользуясь никакими другими арифметическими операциями, 
 * кроме умножения, сложения и вычитания, 
 * вычислите за минимальное число операций:
 * 2x^4 -3х^3 + 4х^2-5х + 6
 * 
 * Упрощённое уравнение: 6 + x*(-5 + x*(4 + x*(-3 + 2*x)))
 * */

public class Task39 {

    public static void main(String[] args) {
	double x = 5.5;

//	double x2 = x * x;
//	double x3 = x2 * x;
//	double x4 = x3 * x;
//	double a = 2 * x4 - 3 * x3 + 4 * x2 - 5 * x + 6;
	
	double a = 6 + x*(-5 + x*(4 + x*(-3 + 2*x)));
	
	System.out.println(a);
    }
}
