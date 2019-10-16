package Bai2;

import java.util.Scanner;

public class BT2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = 0;
		System.out.println("Nhập chuỗi bất kỳ: ");
		String str = sc.nextLine();
		for(int i = 0; i < str.length(); i++)
		{
			if(str.charAt(i) >= '0' && str.charAt(i) <= '9')
				s+=str.charAt(i)-48;
		}
		System.out.println("Tổng = "+s);
	}

}
