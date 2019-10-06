package Bai_8;

import java.util.Scanner;

public class BT8 {
	public static int TimMax(int a, int b)
	{
		if(a>b)
			return a;
		return b;
	}
	
	public static int TimMin(int a, int b)
	{
		if(a<b)
			return a;
		return b;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số thứ nhất: ");
		int a = sc.nextInt();
		System.out.println("Nhập số thứ hai: ");
		int b = sc.nextInt();
		System.out.println("Nhập số thứ ba: ");
		int c = sc.nextInt();
		
		System.out.println("Số lớn nhất là: "+TimMax(TimMax(a, b), c));
		System.out.println("Số nhỏ nhất là: "+TimMin(TimMin(a, b), c));
	}

}
