package Bai_6;

import java.util.Scanner;

public class BT6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số nguyên thứ nhất: ");
		int a = sc.nextInt();
		System.out.println("Nhập số nguyên thứ hai: ");
		int b = sc.nextInt();
		System.out.println("Nhập số thực thứ nhất: ");
		float n = sc.nextFloat();
		System.out.println("Nhập số thực thứ hai: ");
		float m = sc.nextFloat();
		System.out.println("Tổng của 2 số nguyên: "+(a+b));
		System.out.println("Tổng của 2 số thực: "+(m+n));
		System.out.println("Tổng của số thực và số nguyên thứ nhất: "+(a+n));
	}

}
