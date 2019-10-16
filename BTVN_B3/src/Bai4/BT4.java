package Bai4;

import java.util.Scanner;

public class BT4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập chuỗi: ");
		String str = sc.nextLine();
		int vt1 = str.indexOf("h");
		int vt2 = str.indexOf("e");
		int vt3 = str.indexOf("l");
		int vt4 = str.lastIndexOf("l");
		int vt5 = str.indexOf("o");
		if(vt1 < vt2 && vt2 < vt3 && vt3 < vt4 && vt4 < vt5)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
	
}
