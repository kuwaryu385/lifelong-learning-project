package practicesukiri;

//public class Main {
//
//	public static void main(String[] args) {
//
//
//
//	}
//}

public class Main {

	public static void main(String[] args) {

	}
}

//replaceAll()メソッドを使った文字列の置換

//public class Main {
//	public static void main(String[] args) {
//		String s = "abc,def:ghi";
//		String w = s.replaceAll("[abdehi]", "X");
//		System.out.println(w);//Xを挿入しよくあるコード進行を残すｃｆｇ
//	}
//}

//split()メソッドを使った文字列の分割
//public class Main {
//	public static void main(String[] args) {
//		String s = "abc,def:ghi";
//		String[] words = s.split("[,:]");//正規表現パターン
//		for (String w : words) {
//			System.out.print(w + "->");//次の文字列のところにうこの文字を挿入置換
//		}
//
//	}
//}

//文字列パターンを用いたペット名のチェック
//Stringクラスのmatches()メソッドの使用
//matches(最初の文字に数字はつかえない,使える数字はA~Zと０〜９だけ、８文字の指定）の文字列パターン
//	boolean isValidPetName(String name) {
//		return name.matches("[A-Z] [A-Z0-9]{7}");//文字列パターン
//	}

//StringBuilderを利用し文字列を１万回無駄ラッシュを表示する
//public class Main {
//	public static void main(String[] args) {
//		StringBuilder sb = new StringBuilder();
//		for (int i = 0; i < 10000; i++) {
//			sb.append("無駄");
//		}
//		String s = sb.toString();
//		System.out.println(s);
//	}
//
//}