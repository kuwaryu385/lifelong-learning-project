package ramuda2;

public class Main {

	public static void main(String[] args) {
		new Thread(() -> System.out.println("Printing from Runnable")).start();

	}
}

//		抽出　サンプル
//		条件を指定して抽出を行うのが filter メソッドです。

//無名クラスの書き方です。
//		List<Integer> list = Arrays.asList(100, 200, 300, 400, 500);
//		list.stream().filter(new Predicate<Integer>() {
//			@Override
//			public boolean test(Integer i) {
//				return i >= 300;
//			}
//		}).forEach(i -> System.out.println(i));
// => 300 400 500 （改行される）

//ラムダ式では
//List<Integer> list = Arrays.asList(100, 200, 300, 400, 500);
//
//list.stream().filter(i -> i >= 300).forEach(i -> System.out.println(i));

// => 300 400 500 （改行される）
