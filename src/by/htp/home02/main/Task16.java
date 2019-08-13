package by.htp.home02.main;

/*
 * 16. На плоскости ХОY задана своими координатами точка А. 
 * Указать, где она расположена (на какой оси 
 * или в каком координатном угле)
 * */

public class Task16 {

    public static void main(String[] args) {
	int x = -1;
	int y = -2;

	if (x == 0 && y == 0) {
	    System.out.println("Точка не задана");
	} else {
	    if (x == 0) {
		System.out.println("Координатная ось Y");
	    } else if (y == 0) {
		System.out.println("Координатная ось X");
	    } else {
		if (x > 0 && y > 0) {
		    System.out.println("I координатная четверть");
		} else if (x < 0 && y > 0) {
		    System.out.println("II координатная четверть");
		} else if (x < 0 && y < 0) {
		    System.out.println("III координатная четверть");
		} else if (x > 0 && y < 0) {
		    System.out.println("IV координатная четверть");
		}
	    }
	}
    }
}
