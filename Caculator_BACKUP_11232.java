package com.mycompany.test;

public class Caculator {

	public static void main(String[] args) {
    int a = 4;
    int b = 2;
    System.out.println( sum(a,b) );
    System.out.println( minus(a,b) );
	}

  private static int sum(int a, int b) {
    return a + b;
  }

	private static int multi(int a, int b){
		return a * b;
	}

<<<<<<< .merge_file_a11248
	//this is akward for division branch as well
=======
//this is akward for master branch
>>>>>>> .merge_file_a11004

  private static int minus(int a, int b, Object GPU) {
		int result = 0;
		if( GPU == null ) {
			result = a - b;
		} else {
			result a - b;
		}
		return result;
  }
}
