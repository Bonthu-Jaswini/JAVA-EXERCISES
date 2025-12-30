package com.jasipracice.samples;

import java.util.*;

public class Findevennumers {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n value");
		n = sc.nextInt();
		for (int i = 0; i <= n; i++) {
			if (i % 2 == 0) {
				System.out.println(i);

			}
		}

	}

}
