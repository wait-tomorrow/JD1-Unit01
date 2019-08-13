package by.htp.home01.main;

/*
 * 31. Составить программу для вычисления пути, 
 * пройденного лодкой, если ее скорость в стоячей воде v км/ч, 
 * скорость течения реки v1 км/ч, время движения по озеру t1 ч, 
 * а против течения реки — t2 ч.
 * */

public class Task31 {

    public static void main(String[] args) {
	double vBoat = 20;
	double vRiver = 5;

	double t1 = 0.5;
	double t2 = 0.5;

	double s1 = vBoat * t1;
	double s2 = (vBoat - vRiver) * t2;

	System.out.println("Путь по озеру: " + s1);
	System.out.println("Путь против течения реки: " + s2);
    }
}
