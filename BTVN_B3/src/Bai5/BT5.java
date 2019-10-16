package Bai5;

import java.math.BigInteger;
import java.util.Scanner;

public class BT5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số a: ");
		String a = sc.nextLine();
		System.out.println("Nhập số b: ");
		String b = sc.nextLine();
		BigInteger inta= new BigInteger(a);
		BigInteger intb= new BigInteger(b);
		System.out.println("Tổng = "+intb.add(inta));
	}

}
