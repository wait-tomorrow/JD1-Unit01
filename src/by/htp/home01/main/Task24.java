package by.htp.home01.main;

/*
 * 24. Найти площадь равнобедренной трапеции с основаниями а и b 
 * и углом α при большем основании а. 
 * */

public class Task24 {

    public static void main(String[] args) {
	double a = 15;
	double b = 10;
	double q = 0.6108; // 35 градусов

	double s = (a * a - b * b) * Math.tan(q) / 2;

	System.out.println("Плошадь трапеции: " + s);
    }
}
