package Bai_1;

import java.util.Scanner;

public class Member {
	private String code;
	private String name;
	private int age;
	private String classname;
	
	public void inputInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập mã sinh viên:");
		code = sc.nextLine();
		System.out.println("Nhập tên sinh viên:");
		name = sc.nextLine();
		System.out.println("Nhập tuổi:");
		age = sc.nextInt();
		System.out.println("Nhập lớp:");
		sc.nextLine();
		classname = sc.nextLine();
	}
	
	public void outputInfo() {
		System.out.println("Mã SV: "+code+" Tên: "+name+" Tuổi: "+age+" Lớp: "+classname);
	}
}
