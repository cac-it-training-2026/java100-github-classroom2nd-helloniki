/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題5 合計金額を求める
 *
 * 入力されたマカロンの個数から合計購入数、合計金額を求めます。
 * 合計購入数、合計金額を求める処理を追記した後で
 * [問題4]の表示を実行例を参考にして改変してください。
 *
 * <実行例>
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >8
 * ショコラ      >2
 * ピスターシュ  >6
 *
 * シトロン     8個
 * ショコラ     2個
 * ピスターシュ 6個
 *
 * 合計個数    16個
 * 合計金額  4480円
 *
 * をお買いあげですね。
 * 承りました。
 *
 */

package lesson01.challenge05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {
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
	}

}
