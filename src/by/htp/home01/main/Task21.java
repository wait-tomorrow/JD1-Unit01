package by.htp.home01.main;

/*
 * 21. Дано действительное число R вида nnn.ddd 
 * (три цифровых разряда в дробной и целой частях). 
 * Поменять местами дробную и целую части числа 
 * и вывести полученное значение числа. 
 * */

public class Task21 {

    public static void main(String[] args) {
	double r = 123.456;

	double a = Math.round((r - (int) r) * 1000);
	double b = (int) r;

	double x = a + b / 1000;

	System.out.println("Число: " + r);
	System.out.println("Результат: " + x);

    }

}
