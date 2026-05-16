package arrays;

public class MinInarray {

	public static void main(String[] args) {
		String s[] = new String[] { "coffee", "water", "chai", "diet coke" };
		String min = s[0];
		for (String str : s) {
			if (str.length() < min.length()) {
				min = str;
			}

		}
		System.out.println("Min String is:" + min);
		System.out.println(" At Index:" + min.length());
	}

}
