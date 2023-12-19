package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào số nguyên n ");
		int n = sc.nextInt();
		if ( n < 0 ) {
			System.out.println("là số nguyên âm");
		}else if ( n > 0 ) {
			System.out.println("là số nguyên dương");
		}else if ( n == 0) {
			System.out.println("là số 0 ");
		}
				
		

	}

};
