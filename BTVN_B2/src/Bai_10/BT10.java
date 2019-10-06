package Bai_10;

import java.util.Scanner;

public class BT10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Giải phương trình ax^2+bx+c=0");
		System.out.println("Nhập a:");
		float a = sc.nextFloat();
		System.out.println("Nhập b:");
		float b = sc.nextFloat();
		System.out.println("Nhập c: ");
		float c = sc.nextFloat();
		
		if(a!=0)
		{
			float delta = b*b-4*a*c;
			if(delta < 0)
			{
				System.out.println("Phương trình vô nghiệm!");
			}
			else if(delta == 0)
			{
				System.out.println("Phương trình có nghiệm kép: ");
				System.out.println("x1 = x2= "+(-b/(2*a)));
			}
			else
			{
				System.out.println("Phương trình có hai nghiệm phân biệt");
				System.out.println("x1 = "+((-b+Math.sqrt(delta))/(2*a)));
				System.out.println("x2 = "+((-b-Math.sqrt(delta))/(2*a)));
			}
		}
		else
		{
			System.out.println("Bạn vừa nhập phương trình bậc nhất! Vui lòng nhập lại a!= 0 để giải pt bậc 2!");
		}
	}

}
