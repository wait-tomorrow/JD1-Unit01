package by.htp.home01.main;

/* 
 * 38.Для данных областей составить линейную программу, 
 * которая печатает true, если точка с координатами (х, у) 
 * принадлежит закрашенной области, и false—в противном случае: 
 * */

public class Task38 {

    public static void main(String[] args) {
	// рисунок a
	int x = 3;
	int y = 1;

	if (y <= (x + 4) && (y <= (-x + 4)) && y >= 0) {
	    System.out.println(true);
	} else {
	    System.out.println(false);
	}

	// рисунок b
	x = 1;
	y = 2;
	boolean answer = false;

	if (y > 0) {
	    if (y < 4 && (x > -2 && x < 2)) {
		answer = true;
	    }
	} else if (y > -3 && (x > -4 && x < 4)) {
	    answer = true;
	}

	System.out.println(answer);

	// рисунок c
	x = 4;
	y = -4;
	answer = false;

	if (x > 0) {
	    if (y > 0 && (y <= Math.sqrt(16 - x * x))) {
		answer = true;
	    } else if (y < 0 && y >= -Math.sqrt(25 - x * x)) {
		answer = true;
	    }
	}

	System.out.println(answer);
    }
}
