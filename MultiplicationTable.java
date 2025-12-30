package com.jasipracice.samples;

import java.util.Scanner;

public class Multiplicationtable {
	public static void main(String[] args) {
		int i, n, value;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value of n ");
		n = sc.nextInt();
		for (i = 1; i < 11; i++) {

			System.out.println(n + " * " + i + " = " + n * i);

		}
	}

}
