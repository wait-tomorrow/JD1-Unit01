package by.htp.home01.main;

/*
 * 30.Три сопротивления R1 R2, и R3 соединены параллельно. 
 * Найдите сопротивление соединения.
 * */

public class Task30 {

    public static void main(String[] args) {
	double R1 = 10;
	double R2 = 20;
	double R3 = 15;

	double Rsum = 1 / (1 / R1 + 1 / R2 + 1 / R3);

	System.out.println("Общее сопротивление: " + Rsum);
    }
}
