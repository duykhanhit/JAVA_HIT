package Bai_9;

import java.util.Scanner;

public class BT9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Giải phương trình ax+b=0");
		System.out.println("Nhập a:");
		float a = sc.nextFloat();
		System.out.println("Nhập b: ");
		float b = sc.nextFloat();
		
		if(a != 0)
			System.out.println("Nghiệm của pt là: x = "+(-b/a));
		else
			System.out.println("Bạn nhập a = 0 rồi! Chạy lại đi nhé!");
	}

}
