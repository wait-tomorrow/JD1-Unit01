package by.htp.home02.main;

/*10. Составить программу, которая определит площадь какого круга меньше.*/

public class Task10 {

    public static void main(String[] args) {
	int R1 = 10; // радиус 1 круга
	int R2 = 20; // радиус 2 круга

	if (R1 < R2) {
	    System.out.println("Площадь первого круга меньше");
	} else if (R2 < R1) {
	    System.out.println("Площадь второго круга меньше");
	} else {
	    System.out.println("Площади кругов равны");
	}
    }
}
