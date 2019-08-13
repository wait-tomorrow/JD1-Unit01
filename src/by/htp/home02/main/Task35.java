package by.htp.home02.main;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/*35. Вычислить число и месяц в невисокосном году по номеру дня*/

public class Task35 {

    public static void main(String[] args) {
	int day = 42;

	Calendar cal = Calendar.getInstance();
	cal.set(2019, 0, day);

	SimpleDateFormat formatter = new SimpleDateFormat("d MMMM");

	String formattedDate = formatter.format(cal.getTime());
	System.out.println(formattedDate);
    }
}
