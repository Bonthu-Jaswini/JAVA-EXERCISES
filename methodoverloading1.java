package com.jasipracice.polymorphism;

public class methodoverloading1 {

public void add(int a, int b) {
			// adding two numbers
			i = a + b;
			System.out.println("sum is " + i);

		}

		public void add(int a, int b, int c) {
			j = a + b + c;
	          // adding 3 numbers
			System.out.println("sum of 3:" + j);

		}

		public static void main(String[] args) {
			methodoverloading1 c = new methodoverloading1();
			c.add(2, 3);
			c.add(2, 3, 4);

		}

	}



