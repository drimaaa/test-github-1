package com.mycompany.test;

public class Caculator {

	public static void main(String[] args) {
    int a = 4;
    int b = 2;
    System.out.println( sum(a,b) );
    System.out.println( minus(a,b) );
	}

  privatte static int sum(int a, int b) {
    return a + b;
  }

  privatte static int minus(int a, int b) {
    return a - b;
  }
}
