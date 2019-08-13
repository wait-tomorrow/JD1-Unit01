package by.htp.home01.main;

/*6. Написать код для решения задачи. 
В n малых бидонах 80 л молока. 
Сколько литров молока в m больших бидонах, если в каждом большом 
бидоне на 12 л. больше, чем в малом?*/

public class Task06 {

    public static void main(String[] args) {
	int n = 8;
	int nTotal = 80;

	int m = 2;
	int mTotal = (nTotal / n + 12) * m;

	System.out.println(mTotal);
    }
}
