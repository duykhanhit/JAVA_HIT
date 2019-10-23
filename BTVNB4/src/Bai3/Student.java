package Bai3;

import java.util.Scanner;

public class Student {
	private String name;
	private String code;
	private int age;
	
	public void inputInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập tên: ");
		name = sc.nextLine();
		System.out.println("Nhập mã sinh viên: ");
		code = sc.nextLine();
		System.out.println("Nhập tuổi: ");
		age = sc.nextInt();
	}
	public void showInfo() {
		System.out.println("Tên: "+name+" Mã SV: "+code+" Tuổi: "+age);
	}
}
