package basic.dev;

import java.util.Scanner;

public class MainApp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào số a ");  
		System.out.println("Nhập vào số b"); 
		System.out.println("Nhập vào số c"); 
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if ( a + b > c || a + c > b || b + c > a ) {
			System.out.println("a, b, c là 3 canh cua tam giac");
		}else if ( a + b < c || a + c < b || b + c < a ) { 
			System.out.println("a, b, c không phai la 3 canh tam giac");
		}
		
		
	}	

};
