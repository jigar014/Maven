package com.mave;
/*Author : Jigar Mehta
 * about first maven project to be push on git hub through source tree.
 * Conversion of cm to inch
 * 
 */

import java.util.Scanner;

public class App {
	double cm;
	double inch;

	Scanner scr = new Scanner(System.in);
	double input = scr.nextDouble();

	public void conv() {
		cm = input;
		inch = cm / 2.54;
		System.out.println(inch);
	}

	public static void main(String[] args) {

		System.out.println("enter cm");

		App app = new App();

		app.conv();

	}
}
class Git{}