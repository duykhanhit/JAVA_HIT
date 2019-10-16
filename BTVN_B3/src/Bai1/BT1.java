package Bai1;

import java.util.Arrays;
import java.util.Scanner;

public class BT1 {

	public static void NhapMang(int []a) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhập các phần tử mảng: ");
		for(int i = 0; i < a.length; i++)
		{
			System.out.print("a["+i+"] = ");
			a[i] = sc.nextInt();
		}
	}
	public static void TimMax3(int []a) {
		int dem=0;
		Arrays.sort(a);
		int max = a[a.length-1];
		for(int i = a.length-2; i >= 0; i--)
		{
			if(a[i]<max)
			{
				dem++;
				max=a[i];
			}
			if(dem==2)
			{
				System.out.println("Số lớn thứ 3 trong mảng là: "+a[i]);
				break;
			}
		}
		if(dem!=2)
			System.out.println("Không có số lớn thứ 3!");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số phần tử của mảng: ");
		int n = sc.nextInt();
		int []a = new int[n];
		NhapMang(a);
		TimMax3(a);
	}

}
