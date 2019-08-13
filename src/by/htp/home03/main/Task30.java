package by.htp.home03.main;

/*
 * 30. Написать программу, переводящую римские цифры в арабские. 
 * 
 * XXIX - 29
 * */

public class Task30 {

    public static void main(String[] args) {
	String s = "XXIX";
	int number = 0;
	int lastNumber = 0;

	for (int x = s.length() - 1; x >= 0; x--) {

	    switch (s.charAt(x)) {
	    case 'X':
		number = convertDecimal(10, lastNumber, number);
		lastNumber = 10;
		break;

	    case 'V':
		number = convertDecimal(5, lastNumber, number);
		lastNumber = 5;
		break;

	    case 'I':
		number = convertDecimal(1, lastNumber, number);
		lastNumber = 1;
		break;
	    }
	}
	System.out.println(number);
    }

    public static int convertDecimal(int value, int lastNumber, int number) {
	if (lastNumber > value) {
	    return number - value;
	} else {
	    return number + value;
	}
    }
}