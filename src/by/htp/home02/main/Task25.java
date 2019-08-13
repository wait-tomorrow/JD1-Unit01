package by.htp.home02.main;

/*
 * 25. Написать программу — модель анализа пожарного датчика в помещении, 
 * которая выводит сообщение «Пожароопасная ситуация», 
 * если температура в комнате превысила 60° С. 
 * */

public class Task25 {

    public static void main(String[] args) {
	int t = (int) (Math.random() * 100);

	System.out.println("Температура в комнате: " + t);
	if (t > 60) {
	    System.out.println("Пожароопасная ситуация!!!");
	}
    }
}
