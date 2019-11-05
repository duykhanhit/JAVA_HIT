package Bai_4;

import java.util.Random;

import Bai_3.Human;

public class BattleField {
	public Human a = new Human();
	public Human b = new Human();
	public int i = 1;
	
	public void Attack() {
		Random rd = new Random();
		while(a.HP > 0 && b.HP > 0)
		{
			a.damage = rd.nextInt(21);
			b.HP -= a.damage;
			b.damage = rd.nextInt(21);
			a.HP -= b.damage;
			System.out.println("==========LẦN "+i+"==========");
			System.out.println("HP của "+a.name+" còn: "+a.HP);
			System.out.println("HP của "+b.name+" còn:"+b.HP);
			i++;
		}
	}
	
	public void input() {
		a.inputHuman();
		b.inputHuman();
	}
	
	public void show() {
		if(b.HP < 0)
			System.out.println("HP của "+b.name+" <= 0 "+a.name+" chiến thắng!!");
		else
			System.out.println("HP của "+a.name+" <= 0 "+b.name+" chiến thắng!!");
	}
}
