/**
 * 第4章 倉庫番のお仕事
 *
 * 問題6 荷物の入れ替え
 *
 * AB興産から今度は荷物の入れ替えの依頼をいただきました。
 * 5袋ある荷物のうち、1が入っている袋と3が入っている袋を
 * 探して値を入れ替え、2が入っている袋と4が入っている袋を
 * 探して値を入れ替える必要があります。
 *
 * 袋にはそれぞれ1～5の数値が入っており、
 * どの袋にどの数値が入っているのかはランダムに決定します。
 * さらにそれぞれの袋の値が重複しないものとします。
 *
 * コメントの位置に適切なコードを記述し、
 * 実行例と同じメッセージを表示してください。
 *
 * <実行例>
 *  E主任：
 *  AB興産の荷物の入れ替えをお願いします。
 *
 *  Yさん：
 *  はい、
 *  入れ替え前の状態は、
 *  3,2,1,5,4
 *  です。
 *
 *  入れ替え後の状態は、
 *  1,4,3,5,2
 *  です。
 *
 */

package lesson04.challenge06;

public class WarehouseManager {

	public static void main(String[] args) {

		int[] ABKosanArray = new int[5];
		boolean loopFlag = true;
		int intputnum;

		//ここに重複チェックおよび値の代入処理を記述する

		for (int i = 0; i < ABKosanArray.length; i++) {

			ABKosanArray[i] = (int) (Math.random() * 10) % 5 + 1;

			do {
				loopFlag = false;
				for (int j = 0; j < i; j++) {
					if (ABKosanArray[i] == ABKosanArray[j]) {
						i--;
						break;
					} else {
						loopFlag = false;
					}

				}
			} while (loopFlag);
		}

		System.out.println("E主任：");
		System.out.println("AB興産の荷物の入れ替えをお願いします。\n");

		System.out.println("Yさん：");
		System.out.println("はい、");
		System.out.println("入れ替え前の状態は、");
		for (int i = 0; i < ABKosanArray.length; i++) {
			System.out.print(ABKosanArray[i]);
			if (i != (ABKosanArray.length - 1)) {
				System.out.print(",");
			}
		}
		System.out.println("\nです。\n");

		//ここに値の入れ替え処理を記述する

		int num1 = -1;
		int num2 = -1;
		int num3 = -1;
		int num4 = -1;
		int num5 = -1;

		for (int i = 0; i < ABKosanArray.length; i++) {
			switch (ABKosanArray[i]) {
			case 1:
				num1 = i;
				break;
			case 2:
				num2 = i;
				break;
			case 3:
				num3 = i;
				break;
			case 4:
				num4 = i;
				break;
			case 5:
				num5 = i;
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + ABKosanArray[i]);
			}

		}

		ABKosanArray[num1] = 3;
		ABKosanArray[num2] = 4;
		ABKosanArray[num3] = 1;
		ABKosanArray[num4] = 2;

		System.out.println("入れ替え後の状態は、");
		for (int i = 0; i < ABKosanArray.length; i++) {
			System.out.print(ABKosanArray[i]);
			if (i != (ABKosanArray.length - 1)) {
				System.out.print(",");
			}
		}
		System.out.println("\nです。");

	}
}
