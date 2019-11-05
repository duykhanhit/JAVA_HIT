package Bai_3;

import java.util.Random;

public class BattleField {

	public Human a = new Human();
	public Human b = new Human();
	
	public void Attack() {
		Random rd = new Random();
		for(int i = 0; i < 4; i++)
		{
			a.damage = rd.nextInt(21);
			b.HP -= a.damage;
		}
		for(int i = 0; i < 5; i++)
		{
			b.damage = rd.nextInt(21);
			a.HP -= b.damage;
		}
	}
	
	public void input() {
		a.inputHuman();
		b.inputHuman();
	}
	
	public void show() {
		System.out.println("HP của "+a.name+" còn: "+a.HP);
		System.out.println("HP của "+b.name+" còn:"+b.HP);
		if(a.HP > b.HP)
			System.out.println(a.name+" chiến thắng!!");
		else
			System.out.println(b.name+" chiến thắng!!");
	}

}
