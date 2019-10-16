package Bai3;

import java.util.ArrayList;
import java.util.Scanner;

public class BT3 {

	public static void main(String[] args) {
		int[] a = new int[100];
		int n=0, op = 0;
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arl = new ArrayList<>();
		System.out.println("==================================Menu==============================");
		System.out.println("\t1. Tạo mảng\t\t\t2. Hiển thị mảng");
		System.out.println("\t3. Thêm phần tử\t\t\t4. Xóa phần tử");
		System.out.println("\t5. Đảo ngược mảng\t\t\t6.Hiển thị a[1] và các số chia hết cho nó");
		System.out.println("\t7. Thoát");
		do {
			System.out.print("\nNhập lựa chọn:");
			op = sc.nextInt();
			switch(op) {
			case 1:
				System.out.println("Nhập số phần tử của mảng: ");
				n = sc.nextInt();
				a=new int[n+100];
				for(int i = 0;i < n; i++)
				{
					System.out.print("a["+i+"] = ");
					a[i] = sc.nextInt();
				}
				break;
			case 2:
				System.out.println("Mảng vừa nhập là: ");
				for (int i = 0; i < n; i++) {
					System.out.print("a["+i+"] = "+a[i]+"\t");
				}
				break;
			case 3:
				System.out.println("Nhập phần tử cần thêm: ");
				int x = sc.nextInt();
				System.out.println("Nhập vị trí muốn thêm: ");
				int k = sc.nextInt();
				for(int i = n; i >= k; i--)
				{
					a[i]=a[i-1];
				}
				a[k]=x;
				n++;
				break;
			case 4:
				System.out.println("Nhập vị trí muốn xóa: ");
				int vt = sc.nextInt();
				for(int i = vt; i < n; i++)
					a[i]=a[i+1];
				n--;
				break;
			case 5:
				for(int i = 0; i < n/2; i++)
				{
					int temp = a[n - 1 -i];
					a[n - 1 -i] = a[i];
					a[i] = temp;
				}
			case 6:
				System.out.println("a[1] = "+a[1]);
				System.out.println("Các phần tử chia hết cho a[1] là: ");
				for(int i = 0; i < n; i++)
				{
					if(a[i]%a[1]==0)
						System.out.println(a[i]+"\t");
				}
			}
		}while(op<7);
	}

}
