package by.htp.home01.main;

/* 28. Составить программу перевода радианной меры угла в градусы, минуты и секунды. */

public class Task28 {

    public static void main(String[] args) {
	double rad = 2;

	double grad = rad * 180 / Math.PI;
	double min = (grad - (int) grad) * 60;
	double sec = (min - (int) min) * 60;

	System.out.println((int) grad + "° " + (int) min + "' " + (int) sec + "\"");
    }
}
