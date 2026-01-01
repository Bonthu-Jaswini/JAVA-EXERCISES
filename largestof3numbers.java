package com.jasipracice.samples;
import java.util.*;
public class FindLargestof3Numbers {
	public static void main(String[] args) {
		int a, b, c, d;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 3 numbers");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
if (a > b) {
			if (a > c) {

				System.out.println("a is largest one" + a);
}
		}
else {
			if (b > c) {

				System.out.println("b is greater");
			} else {
				System.out.println(" c is greater");
			}
}
	}
}
