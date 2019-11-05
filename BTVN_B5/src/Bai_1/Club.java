package Bai_1;

import java.util.Scanner;

public class Club {
	private Member list[];
	
	public void inputMember() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số thành viên:");
		int n = sc.nextInt();
		list = new Member[n];
		for(int i = 0; i < list.length; i++)
		{
			list[i] = new Member();
			System.out.println("Nhập thông tin thành viên thứ "+(i+1));
			list[i].inputInfo();
		}
	}
	public void outputMember() {
		for(int i = 0; i < list.length; i++)
		{
			list[i].outputInfo();
		}
	}
}
