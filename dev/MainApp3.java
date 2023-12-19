package basic.dev;

import java.util.Scanner;
import java.lang.Math;

public class MainApp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap vao a ");
		System.out.println("nhap vao b");
		System.out.println("nhap vao c ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		double x1 = (-b + Math.sqrt(b * b - 4 * a * c) / 2 * a);
		double x2 = (-b - Math.sqrt(b * b - 4 * a * c) / 2 * a);
		double x = (- b / 2 * a) ;
		
		if ( b * b - 4 * a * c < 0) {
			System.out.println("phuong trinh vo nghiem");
		}else if ( b * b - 4 * a * c == 0) {
			System.out.println("phuong trinh co hai nghiem kep" + x );
		}else if (b * b - 4 * a * c > 0) {
			System.out.println("phuong trinh co hai nghiem" + x1 + " va " + x2);
		}
		
		
		
	}

};
