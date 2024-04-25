package main;

import java.util.Random;
import java.util.Scanner;

import process.process;

public class main {

	private static final int MAX = 1000;
	private static final int MAX1 = 1000;
	private static final int MAX2 = 1000;
	private static final int MAX3 = 1000;
	private static final int MAX4 = 1000;
	
	private static Random r = new Random();
	private static Random r1 = new Random();
	private static Random r2 = new Random();
	private static Random r3 = new Random();
	private static Random r4 = new Random();
	
	public static void main(String[] args) {
		// キャラクターのインスタンスを作成
		process player = new process();
		
		int n = r.nextInt(MAX);
		int n1 = r1.nextInt(MAX);
		int n2 = r2.nextInt(MAX);
		int n3 = r3.nextInt(MAX);
		int n4 = r4.nextInt(MAX);
		
		//Scannerで初期化
		Scanner scanner = new Scanner(System.in);
		//文字列の入力の受け取り
		String name = scanner.next();
		
		player.setName(name);
		player.setHp(n);
		player.setMp(n1);
		player.setAttack(n2);
		player.setAgility(n3);
		player.setDefense(n4);

		// コンソールに出力
		System.out.println();
		System.out.println("こんにちは " + "「" + player.getName() + "」" + " さん");
		System.out.println("ステータス");
		System.out.println("HP：" + player.getHp());
		System.out.println("MP：" + player.getMp());
		System.out.println("攻撃力：" + player.getAttack());
		System.out.println("素早さ：" + player.getAgility());
		System.out.println("防御力：" + player.getDefense());
		System.out.println("\nさあ冒険に出かけよう！");
	}

}
