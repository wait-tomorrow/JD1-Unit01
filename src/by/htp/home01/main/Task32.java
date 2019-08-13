package by.htp.home01.main;

/*
 * 32. Текущее показание электронных часов: 
 * m ч (0 ≤ m ≤ 23) 
 * n мин(0 ≤ n ≤ 59) 
 * k с (0 ≤ k ≤ 59). 
 * Какое время будут показывать часы через р ч q мин r с?
 * */

public class Task32 {

    public static void main(String[] args) {
	int h = 23;
	int m = 01;
	int s = 30;

	int p = 1;
	int q = 25;
	int r = 35;

	h = h + p;
	m = m + q;
	s = s + r;

	if (s > 59) {
	    m = m + s / 60;
	    s = s - ((int) s / 60) * 60;
	}

	if (m > 59) {
	    h = h + m / 60;
	    m = m - ((int) m / 60) * 60;
	}

	if (h > 23) {
	    h = h - ((int) h / 23) * 24;
	}

	System.out.println(h + "ч " + m + "мин " + s + "сек");
    }
}
