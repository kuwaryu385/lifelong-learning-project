package ramuda;

interface Func1 {
	boolean call(int x);
}

interface Func2 {
	String call(boolean male, String name);
}

public class Main {
	public static void main(String[] args) {
		FuncList funcList = new FuncList();
		Func1 f1 = FuncList::isOdd;
		Func2 f2 = funcList::addNamePrefix;
		System.out.println(f1.call(14));
		System.out.println(f2.call(true, "Smith"));

	}
}

//import java.util.function.IntBinaryOperator;
//
////ラムダ式は関数をその場で生成、代入、呼び出すよ！
//public class Main {
//	public static void main(String[] args) {
//		//２つの引数の差を求める処理の実体を生み出し、代入する
//		IntBinaryOperator func = (int a, int b) -> {
//			return a - b;
//		};//この行が実行された瞬間カンスの実体が生み出される
//		int a = func.applyAsInt(5, 3);
//		System.out.println("5-3=" + a);
//	}
//}

//import java.util.function.IntBinaryOperator;
//
////メソッドを変数に代入して呼び出す例
//public class Main {
//	//２つのint値を受け取り、その差を求め、結果を返す関数
//	public static int sub(int a, int b) {
//		return a - b;
//	}
//
//	public static void main(String[] args) {
//		//subメソッドの処理ロジックを、変数funcに代入する
//		IntBinaryOperator func = Main::sub;//ここで代入する
//		//変数funcに格納されている処理ロジックを、引数５と３で実行する
//		int a = func.applyAsInt(5, 3);//ここで呼び出している
//		System.out.println("5-3は" + a);
//	}
//
//}
