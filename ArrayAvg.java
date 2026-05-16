package arrays;

public class findavgofintsinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method
		int m[] = new int[] { 2, 5, 3, 9, 6 };
		int avg = 0, sum = 0;
		int i = 0;
		while (i < m.length) {
			sum = sum + m[i];
			avg = sum / m.length;
			i++;
		}
		System.out.println(avg);

	}

}
