package by.htp.home01.main;

/*
 * 22. Дано натуральное число Т, которое представляет длительность прошедшего 
 * времени в секундах. Вывести данное значение длительности в часах, 
 * минутах и секундах в следующей форме: ННч ММмин SSc. 
*/

public class Task22 {

    public static void main(String[] args) {
	int t = 152109;

	int hh = t / 3600;
	int mm = (t - hh * 3600) / 60;
	int ss = (t - (hh * 3600 + mm * 60));

	System.out.println(hh + "ч " + mm + "мин " + ss + "с");
    }
}
