/**
 * 第7章 武士のお仕事
 *
 * 問題14 複数のインターフェースを実装する
 *
 * 勘定奉行インタフェース、文化人インターフェースを実装する。
 *
 * 藩士クラスに勘定奉行インターフェースと文化人インターフェースを
 * 実装してください。
 *
 * <実行例>
 * 藩士1：
 * 藩の資産を計算するよ～。
 * 茶道を嗜むよ～。
 *
 */

package lesson07.challenge14;

//ここにIChiefTreasurerインターフェースを記述
interface IChiefTreasurer {
	String str1 = "藩の資産を計算するよ～。";
}

//ここにICelebrityインターフェースを記述
interface ICelebrity {
	String str2 = "茶道を嗜むよ～。";
}

//ここにSamuraiクラスを記述
abstract class Samurai {

}

//ここにRetainerクラスを記述
class Retainer implements IChiefTreasurer, ICelebrity {
	void learn() {
		System.out.println(str1);
		System.out.println(str2);
	}
}

public class CastleTown {

	public static void main(String[] args) {
		System.out.println("藩士1：");

		//ここに適切な処理を記述;
		Retainer Retainer = new Retainer();
		Retainer.learn();
	}
}
