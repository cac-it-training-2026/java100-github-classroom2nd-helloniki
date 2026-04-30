/**
 * 第7章 武士のお仕事
 *
 * 問題13 インターフェース②
 *
 * 文化人インターフェースを作る。
 *
 * 抽象メソッドlearn()を持つ文化人インターフェースICelebrityを
 * 作成し、藩士クラスと浪人クラスにそれぞれ実装し、<実行例>と
 * 同じメッセージを表示してください。
 *
 * <実行例>
 * 藩士1：
 * 茶道を嗜むよ～。
 *
 * 浪人1：
 * 塾を開くよ～。
 *
 *
 */

package lesson07.challenge13;

//ここにICelebrityインターフェースを記述
abstract interface ICelebrity {
	String str1 = "茶道を嗜むよ～。";
	String str2 = "塾を開くよ～。";

	abstract void learn();

}

//ここにSamuraiクラスを記述
abstract class Samurai {

}

//ここにRetainerクラスを記述
class Retainer implements ICelebrity {
	public void learn() {
		System.out.println(str1);
	}
}

//ここにRoninクラスを記述
class Ronin implements ICelebrity {
	public void learn() {
		System.out.println(str2);
	}
}

public class CastleTown {

	public static void main(String[] args) {
		System.out.println("藩士1：");

		//ここに適切な処理を記述
		Retainer Retainer = new Retainer();
		Retainer.learn();

		System.out.println("\n浪人1：");

		//ここに適切な処理を記述
		Ronin Ronin = new Ronin();
		Ronin.learn();

	}
}
