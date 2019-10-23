package Bai1;

import java.io.ObjectInputStream.GetField;

public class RunMain {
	/*
	 *  Trong class Person
		Tạo getter, setter cho các thuộc tính.
		Tạo class RunMain có hàm main trong đó
		Tạo ra 2 đối tượng Person SonNghien và Person TuBueDe.
		Dùng Setter truyền vào giá trị thông tin cho 2 đối tượng (Không phải nhập).
		Hiển thị thông tin 2 đối tượng.
	*/

	public static void main(String[] args) {
		Person SonNghien = new Person();
		Person TuBeDe = new Person();
		
		SonNghien.setName("Sơn");
		SonNghien.setAge(20);
		SonNghien.setSex("Nữ");
		
		TuBeDe.setName("Tú");
		TuBeDe.setAge(18);
		TuBeDe.setSex("Bê đê");
		System.out.println("Tên\tTuổi\tGiới tính");
		System.out.println(SonNghien.getName()+"\t"+SonNghien.getAge()+"\t"+SonNghien.getSex());
		System.out.println(TuBeDe.getName()+"\t"+TuBeDe.getAge()+"\t"+TuBeDe.getSex());
	}

}
