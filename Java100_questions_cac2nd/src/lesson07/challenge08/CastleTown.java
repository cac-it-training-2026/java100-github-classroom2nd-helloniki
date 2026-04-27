/**
 * 第7章 武士のお仕事
 *
 * 問題8  equals()メソッドの利用
 *
 * equals()メソッドを適切にオーバーライドする。
 *
 * 問題7で作成した藩士クラスにequals()メソッドをオーバーライドする
 * 記述を追加し、同じ藩の所属かどうか確認する処理に変更してください。
 * （※藩士クラスにフィールドprotected String domainを追記）
 * （名前と一緒に藩名もコンストラクタで設定する）
 *
 * <実行例>
 * ○△□藩の藩士を二つ作ります。
 *
 * 拙者は○△□藩士、テスト太郎ともうす。
 * 拙者は○△□藩士、テスト次郎ともうす。
 *
 * 同じ藩に所属しているか確認します。
 *
 * 【同じ藩に所属しています】
 *
 * ○△×藩の藩士を一つ作ります。
 *
 * 拙者は○△×藩士、テスト三郎ともうす。
 *
 * 同じ藩に所属しているか確認します。
 *
 * 【同じ藩に所属していません】
 *
 */

package lesson07.challenge08;

class Samurai {

	protected String name;

	void fight() {
		System.out.println("戦うよ～。");
	}

	boolean equal(String domain1, String doman2) {
		return true;
	}

}

//ここにRetainerクラスを記述
class Retainer extends Samurai {
	protected String domain;

	public Retainer(String name, String domain) {
		this.name = name;
		this.domain = domain;
	}

	boolean equal(String domain1, String doman2) {
		if (domain1.equals(doman2)) {
			return true;
		} else {
			return false;
		}
	}
}

public class CastleTown {

	public static void main(String[] args) {
		System.out.println("○△□藩の藩士を二つ作ります。\n");

		//ここに適切な処理を記述
		Retainer retainer1 = new Retainer("テスト太郎", "○△□");
		System.out.println(" 拙者は" + retainer1.domain + "藩士," + retainer1.name + "ともうす。");
		Retainer retainer2 = new Retainer("テスト次郎", "○△□");
		System.out.println(" 拙者は" + retainer2.domain + "藩士," + retainer2.name + "ともうす。");

		System.out.println("\n同じ藩に所属しているか確認します。\n");

		//ここに適切な処理を記述
		if (retainer1.equal(retainer1.domain, retainer2.domain)) {
			System.out.println("【同じ藩に所属しています】");
		}
		System.out.println("\n○△×藩の藩士を一つ作ります。\n");

		//ここに適切な処理を記述
		Retainer retainer3 = new Retainer("テスト次郎", "○△×");
		System.out.println(" 拙者は" + retainer3.domain + "藩士," + retainer3.name + "ともうす。");

		System.out.println("\n同じ藩に所属しているか確認します。\n");

		//ここに適切な処理を記述
		if (retainer1.equal(retainer1.domain, retainer3.domain)) {
			System.out.println("【同じ藩に所属しています】");
		} else {
			System.out.println("【同じ藩に所属していません】");
		}

	}
}
