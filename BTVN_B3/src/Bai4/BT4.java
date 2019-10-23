package Bai4;

import java.util.Scanner;

public class BT4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập chuỗi: ");
		String str = sc.nextLine();
		int vt1 = str.indexOf("h");
		int vt2 = str.indexOf("e",vt1+1);
		int vt3 = str.indexOf("l",vt2+1);
		int vt4 = str.lastIndexOf("l",vt3+1);
		int vt5 = str.indexOf("o",vt4+1);
		if(vt1 > -1 && vt2 > -1 && vt3 > -1 && vt4 > -1 && vt5 > -1)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
	
}
