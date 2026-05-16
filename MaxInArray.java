package arrays;

public class MaxofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n[] = new int[] { 2, 5, 1, 9, 6 };
		int max = n[0];
		for (int i = 0; i < n.length; i++) {
			if (n[i] > max) {
				max = n[i];
			}

		}

		System.out.print(max);
	}
}
