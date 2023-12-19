package basic.dev;

import java.util.Scanner;

public class MainApp4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap so nguyen n");
		int n = sc.nextInt();
		if ( n % 3 == 0 && n % 5 == 0 ){
			System.out.println("n chia het cho 3 va 5");
		}
		else if ( n % 3 == 0) {
			System.out.println("n chia het cho 3");
		}else if ( n % 5 == 0) {
			System.out.println("n chia het cho 5");
		}else {
			
		}if (n % 3 != 0 ) {
			System.out.println("n khong chia het cho 3 ");
		}if (  n % 5 != 0){
			System.out.println("n khong chia het cho 5");
		}
		
		/*}else if ( n % 3 == 0 || n % 5 == 0 ){
			System.out.println("n chia het cho 3 va 5");
		}else if (  n % 5 != 0){
			System.out.println("n khong chia het cho 5");
		}*/

	}

};
