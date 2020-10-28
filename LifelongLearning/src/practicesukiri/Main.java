package practicesukiri;

public class Main {

	public static void main(String[] args) {

	}
}

//文字列パターンを用いたペット名のチェック
//Stringクラスのmatches()メソッドの使用
//matches(最初の文字に数字はつかえない,使える数字はA~Zと０〜９だけ、８文字の指定）の文字列パターン
//	boolean isValidPetName(String name) {
//		return name.matches("[A-Z] [A-Z0-9]{7}");//文字列パターン
//	}

//StringBuilderを利用し文字列を１万回無駄ラッシュを表示する
//public class Main {
//
//	public static void main(String[] args) {
//		StringBuilder sb = new StringBuilder();
//		for (int i = 0; i < 10000; i++) {
//			sb.append("無駄");
//		}
//		String s = sb.toString();
//		System.out.println(s);
//
//	}
//
//}