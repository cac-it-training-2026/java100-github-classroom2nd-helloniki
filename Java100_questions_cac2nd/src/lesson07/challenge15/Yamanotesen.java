package lesson07.challenge15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Yamanotesen {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		String[] stations = { "品川", "高輪ゲートウェイ", "田町", "浜松町",
				"新橋", "有楽町", "東京", "神田", "秋葉原", "御徒町", "上野",
				"鶯谷", "日暮里", "西日暮里", "田端", "駒込", "巣鴨", "大塚",
				"池袋", "目白", "高田馬場", "新大久保", "新宿", "代々木",
				"原宿", "渋谷", "恵比寿", "目黒", "五反田", "大崎" };
		int[] already = new int[30];
		boolean loopFlag = true;
		boolean wholeFlag = true;
		int count = 0;
		int count2 = 0;

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("「※※※ 山手線ゲーム ※※※」");
		System.out.println("「      ゲームスタート！    」");
		System.out.println(" 山手線沿線の駅名を入力し、エンターキーを押してください。");
		int randomstation = 0;

		do {
			String str = reader.readLine();
			for (int i = 0; i < stations.length; i++) {
				do {
					if (str.equals(stations[i])) {
						loopFlag = false;
						already[i] = 1;
						i = 50;
					} else {
						loopFlag = false;
						count++;
					}
				} while (loopFlag);
			}

			if (count == 30) {
				wholeFlag = false;
				System.out.println("「あなたの負けです！」");
				break;
			}
			count = 0;

			for (int i = 0; i < already.length; i++) {
				randomstation = (int) (Math.random() * 30);
				if (already[randomstation] == 0) {
					already[randomstation] = 1;
					System.out.println(stations[randomstation]);
					count2++;
					break;
				} else {
					continue;
				}
			}

			if (count2 == 15) {
				wholeFlag = false;
				System.out.println("「あなたの勝ちです！」");
			}

		} while (wholeFlag);

		System.out.println("終了しました。");

	}

}
