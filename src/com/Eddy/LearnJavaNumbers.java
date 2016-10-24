package com.Eddy;

public class LearnJavaNumbers {
	public static void main(String[] args) {
		System.out.println("interger = " + 10 + "\ndouble = " + 3.14 + "\nboolean = " + true);

		System.out.printf("pi = %.5f", Math.PI);// for 5 decimal places

		// declaring variables

		int fooInt = 1;
		// declaring multiple variables of the same type
		int fooInt1, fooInt2, fooInt3;
		fooInt1 = fooInt2 = fooInt3 = 1;

		// byte is a signed two complemetn interger
		// from -128 to 128
		byte fooByte = 100;

		// this is a 16 bit two complement interger
		// -32k to 32k
		short fooShort = 32000;

		// int 32 bit

		int fooInt9 = 214748364;

		// Long - 64-bit signed two's complement integer
		// (-9,223,372,036,854,775,808 <= long <= 9,223,372,036,854,775,807)
		long fooLong = 1000L;
		// L is used to denote that this variable value is of type Long;
		// anything without is treated as integer by default.

	}

}
