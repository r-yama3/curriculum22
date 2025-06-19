package packageB;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PackB {
	private String country;
	private String food;

	public PackB(String country, String food) {
		this.country = country;
		this.food = food;
	}

	public void showInfo() {
		System.out.println("こんにちは！ここは" + country + "です！");
		//こんにちは！ここは日本です！
		System.out.println("この" + food + "はうまい");
		//この寿司はうまい
		System.out.println("" + food + "は和食です");
		//寿司は和食です
		LocalDateTime now = LocalDateTime.now(); //日時を取得
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		//出力形式の指定
		String formattedDate = now.format(formatter);
		System.out.println("今の現在日時は" + formattedDate + "です");
		//今の現在日時は2023/03/09 10:23:39です
	}
}

//thisを使って作成してください。
//日時は今日の日付を取得してください。
