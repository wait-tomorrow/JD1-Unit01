package by.htp.home02.main;

/*
 * 24. Составить программу, определяющую результат 
 * гадания на ромашке — «любит—не любит», 
 * взяв за исходное данное количество лепестков n. 
 * */

public class Task24 {

    public static void main(String[] args) {
	int n = 15;

	// k -  число от 0 до 1, сдвиг для рандомности предсказания
	int k = (int) (Math.random() * 10);

	for (int i = 0 + k; i < n + k; i++) {
	    if (i % 2 == 0) {
		System.out.println("Любит");
	    } else {
		System.out.println("Не любит");
	    }
	}
    }
}
