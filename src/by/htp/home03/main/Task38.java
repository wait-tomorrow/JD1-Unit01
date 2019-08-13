package by.htp.home03.main;

/*
 * 38. Для заданного натурального числа определить, 
 * образуют ли его цифры арифметическую прогрессию. 
 * Предполагается, что в числе не менее трёх цифр.
 * Например: 1357, 963
 * */

public class Task38 {

    public static void main(String[] args) {
	int a = 13579;

	int step = 0;
	int prevNumber = 0;
	boolean progression = true;

	while (a > 0) {

	    if (step != 0) {
		if (prevNumber - (a % 10) != step) {
		    progression = false;
		    break;
		}
	    } else {
		if (prevNumber != 0) {
		    step = prevNumber - a % 10;
		}
	    }

	    prevNumber = a % 10;
	    a = a / 10;
	}

	if (progression) {
	    System.out.println("Это арифметическая прогрессия!");
	} else {
	    System.out.println("Это НЕ арифметическая прогрессия!");
	}
    }
}
