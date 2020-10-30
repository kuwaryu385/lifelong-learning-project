package collection;

//
//public class Main {
//	//int型はダメでもInteger型なら格納可能 ArrayListに基本データ型の情報は格納できない。

//	public static void main(String[] args) {
//		//Integer型でArrayListを宣言
//		ArrayList<Integer> points = new ArrayList<Integer>();
//		//自動的にIntegerに変換・格納される。
//		points.add(10);
//		points.add(120);
//		points.add(130);
//		for (int i : points) {
//			System.out.println(i);
//		}
//
//	}
//}
//イテレーターの書き方
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("田中");
		names.add("山田");
		names.add("中田");
		Iterator<String> it = names.iterator();
		while (it.hasNext()) { //矢印を次に進められるなら繰り返す
			String e = it.next(); //矢印を進め、内容を取り出す。
			System.out.println(e);

		}

	}
}
