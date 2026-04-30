/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題6  在庫を減らす
 *
 * [問題5]までの表示を行った後で
 * 3種のマカロンそれぞれの在庫を減らす処理を追記し
 * 以下の実行例と同じものを最後に表示してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り22個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り24個
 *
 */

package lesson01.challenge06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {

		int num_siro = 30;
		int num_choco = 30;
		int num_pisu = 30;

		System.out.println("本日のおすすめ商品です。");
		System.out.println("");
		System.out.println("シトロン　　　\\250・・・残り" + num_siro + "個");
		System.out.println("ショコラ　　　\\280・・・残り" + num_choco + "個");
		System.out.println("ピスターシュ　\\320・・・残り" + num_pisu + "個");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("それぞれ何個ずつ買いますか？（最大30個まで）");
		System.out.println("");

		System.out.print("シトロン　　　＞");
		String str = reader.readLine();
		int siro = Integer.parseInt(str);

		System.out.print("ショコラ　　　＞");
		str = reader.readLine();
		int choco = Integer.parseInt(str);

		System.out.print("ピスターシュ　＞");
		str = reader.readLine();
		int pisu = Integer.parseInt(str);

		System.out.println();
		System.out.println("シトロン　　" + siro + "個");
		System.out.println("ショコラ　　" + choco + "個");
		System.out.println("ピスターシュ" + pisu + "個");
		System.out.println();

		System.out.println("合計個数　　" + (siro + choco + pisu) + "個です");
		System.out.println("合計金額　" + (siro * 250 + choco * 280 + pisu * 320) + "円です");

		System.out.println("");
		System.out.println("を買いあげですね。");
		System.out.println("承りました。");

		num_siro -= siro;
		num_choco -= choco;
		num_pisu -= pisu;

		System.out.println("");
		System.out.println("本日のおすすめ商品です。");
		System.out.println("");
		System.out.println("シトロン　　　\\250・・・残り" + num_siro + "個");
		System.out.println("ショコラ　　　\\280・・・残り" + num_choco + "個");
		System.out.println("ピスターシュ　\\320・・・残り" + num_pisu + "個");
	}

}
