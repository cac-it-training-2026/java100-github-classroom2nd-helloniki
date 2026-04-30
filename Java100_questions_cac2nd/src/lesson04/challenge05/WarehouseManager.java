/**
 * 第4章 倉庫番のお仕事
 *
 * 問題5  袋の中身を調べる【改訂版】
 *
 * AB興産から預かっている荷物を再び検査することになりました。
 * 荷物は全部で5袋あり、その中で数値の5が入っている袋が
 * 何袋目なのかを調べなければなりません。
 *
 * 袋にはそれぞれ1～5の数値が入っており、
 * どの袋にどの数値が入っているのかはランダムに決定します。
 * さらに今回はそれぞれの袋の値が重複しないものとします。
 * （つまり、5が入っている袋はただ一つだけ）
 *
 * コメントの位置に適切なコードを記述し、
 * 実行例と同じメッセージを表示してください。
 *
 * <実行例>
 *  E主任：
 *  AB興産の荷物の検査結果を教えてください。
 *
 *  Yさん：
 *  はい、
 *  【※ここに値を出力】袋目
 *  に入っていました。
 *
 */

package lesson04.challenge05;

public class WarehouseManager {

	public static void main(String[] args) {

		//ここに配列の宣言を記述する
		int[] find_five = new int[5];
		int min = 1;
		int max = 5;

		int intputNum = 0;
		boolean loopFlag = false;

		//ここに重複チェックおよび値の代入処理を記述する
		find_five[0] = (int) (Math.random() * (max - min + 1)) + min;

		for (int i = 1; i < find_five.length; i++) {
			intputNum = (int) (Math.random() * (max - min + 1)) + min;

			for (int j = 0; j < i; j++) {
				if (intputNum == find_five[j]) {
					i--;
					break;
				} else {
					find_five[i] = intputNum;
				}

			}

		}
		//ここでdo文を使うとfor文のiをわざわざ1から始める必要がないし1番目の配列をわざわざ外に出す必要もない。。後判定、前判定の違いが理解てきてない。用勉強

		System.out.println("E主任：");
		System.out.println("AB興産の荷物の検査結果を教えてください。\n");

		System.out.println("Yさん：");
		System.out.println("はい、");

		//ここに要素の確認および何袋目かの出力処理を記述する
		for (int i = 0; i < find_five.length; i++) {
			if (find_five[i] == 5) {
				System.out.println((i + 1) + "袋目");
			}

		}

		System.out.println("に入っていました。");

	}
}
