package by.htp.home02.main;

/* 
 * 8. Составить программу нахождения 
 * наименьшего из квадратов двух чисел а и b
 * */

public class Task08 {

    public static void main(String[] args) {
	int a = 3;
	int b = 3;
	
	a = a*a;
	b = b*b;
	
	if (a<b) {
	    System.out.println(a);
	} else if(b<a) {
	    System.out.println(b);
	} else {
	    System.out.println("Квадраты введенных чисел равны");
	}
    }
}
