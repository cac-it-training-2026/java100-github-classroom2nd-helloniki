/**
 * 第7章 武士のお仕事
 *
 * 問題9  getClass()メソッドの利用
 *
 * 侍クラスのサブクラスをまとめて扱う。
 *
 * 要素数5の侍クラスの配列を用意し、
 * 藩士クラス、浪人クラスの何れかをランダムで代入します。
 * getClass()メソッドを使いそれぞれの要素に何のクラスの
 * オブジェクトが入ったか表示してください。
 * （藩士クラス、浪人クラスともに
 *   デフォルトコンストラクタを用意します）
 *
 * <実行例>
 * 5人の侍を配列に詰めます。
 *
 * 詰め終わりました。
 *
 * それぞれ表示してみます。
 *
 * class lesson11_12.challenge09.Ronin
 * class lesson11_12.challenge09.Ronin
 * class lesson11_12.challenge09.Retainer
 * class lesson11_12.challenge09.Ronin
 * class lesson11_12.challenge09.Retainer
 *
 */

package lesson07.challenge09;

import java.util.ArrayList;
import java.util.List;

class Samurai {

	protected String name;

	void fight() {
		System.out.println("戦うよ～。");
	}

	void work() {
		System.out.println("何かして働くよ～");
	}

}

//ここにRetainerクラスを記述
class Retainer extends Samurai {
	boolean Flag;

	public Retainer(int input) {
		if (input == 0) {
			Flag = true;
		} else {
			Flag = false;
		} // TODO 自動生成されたコンストラクター・スタブ
	}

}

//ここにRoninクラスを記述
class Ronin extends Samurai {

	public void getClass(Samurai samurai) {
		System.out.println(samurai);
	}
}

public class CastleTown {

	public static void main(String[] args) {
		System.out.println("5人の侍を配列に詰めます。\n");

		//ここに適切な処理を記述
		List<Samurai> samurais = new ArrayList<>();

		for (int i = 0; i < 5; i++) {
			int input = (int) (Math.random() * 10) % 2;
			Retainer retainer = new Retainer(input);
			Ronin ronin = new Ronin();

			if (retainer.Flag) {
				samurais.add(retainer);
			} else {
				samurais.add(ronin);
			}
		}

		System.out.println("詰め終わりました。\n");
		System.out.println("それぞれ表示してみます。\n");

		//ここに適切な処理を記述
		Ronin ronin = new Ronin();
		for (Samurai samurai : samurais) {
			ronin.getClass(samurai);
		}

	}
}
