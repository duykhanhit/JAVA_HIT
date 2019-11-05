package Bai_2;

import java.util.Random;
import java.util.Scanner;

public class Knight {
	private String name;
	private int HP;
	public int MP;
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập tên hiệp sĩ:");
		name = sc.nextLine();
		Random rd = new Random();
		HP = rd.nextInt(101);
		MP = 50+rd.nextInt(501);
	}
	
	public void heal() {
			HP += 30;
			MP -= 50;
			System.out.println("HP: "+HP);
			System.out.println("MP: "+MP);
	}
}
