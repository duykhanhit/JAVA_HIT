package Bai3;

import java.util.Scanner;

public class JavaClass {
	private Student stdList[];
	private String nameleader;
	private int ratingStar;
	
	private void inputStudent() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhập số sinh viên: ");
		int n = sc.nextInt();
		stdList = new Student[n];
		for (int i = 0; i < stdList.length; i++) {
			stdList[i] = new Student();
			System.out.println("Thông tin sinh viên thứ "+(i+1));
			stdList[i].inputInfo();
		}
	}
	private void showStudent() {
		for (int i = 0; i < stdList.length; i++) {
			stdList[i].showInfo();
		}
	}
	public void InputClassInfo() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhập tên leader: ");
		nameleader = sc.nextLine();
		System.out.println("Đánh giá: ");
		ratingStar = sc.nextInt();
		inputStudent();
	}
	public void ShowClassInfo() {
		System.out.println("Tên leader: "+nameleader+" Đánh giá: "+ratingStar);
		showStudent();
	}
}
