package by.htp.home02.main;

/*
 * 22. Перераспределить значения переменных х и у так, 
 * чтобы в х оказалось большее из этих значений, а в y - меньшее. 
 * */

public class Task22 {

    public static void main(String[] args) {
	int x = 4;
	int y = 7;

	int temp = 0;

	if (y > x) {
	    temp = x;
	    x = y;
	    y = temp;
	} else if (x > y) {
	    temp = y;
	    y = x;
	    x = temp;
	}

	System.out.println("x = " + x + "\ny = " + y);
    }
}
