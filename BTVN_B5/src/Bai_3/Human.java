package Bai_3;

import java.util.Scanner;

public class Human {
	public String name;
	public int HP = 100;
	public int damage;
	
	public void inputHuman() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập tên: ");
		name = sc.nextLine();
	}
}
