package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//Nhap 2 so nguyen
		System.out.println("nhap so nguyen a");
		int a = sc.nextInt();
		sc.nextLine();
		System.out.println("nhap so nguyen b");
		int b = sc.nextInt();
		sc.nextLine();
		
		int sum = a + b ;
		int sub = a - b;
		int mul = a * b;
		double div = a / b;
		System.out.format(" - Tong: %d - Hieu: %d - Tich: %d - Thuong: %.2f", sum , sub , mul , div);
		sc.nextLine();
		
		//So sánh a và b
		System.out.println("So sanh a va b");
		boolean c = a > b ;
		System.out.println("a > b:   " + c);
		c = a < b ;
		System.out.println("a < b:   " + c);
		c = a >= b ;
		System.out.println("a >= b:  " + c);
		c = a <= b ;
		System.out.println("a <= b:  " + c);
	}

}
