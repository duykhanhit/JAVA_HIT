package Bai_2;

public class RunMain {

	public static void main(String[] args) {
		Knight a = new Knight();
		int i = 1;
		a.input();
		while(a.MP >= 50)
		{
			System.out.println("Lần "+i+": ");
			a.heal();
			i++;
		}
		System.out.println("Nạp thẻ 500k để hồi 50MP nhé!");
	}

}
