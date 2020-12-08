package junit.tutorial;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

import junittutorial.Calculator;

public class CalculatorTest {

	@SuppressWarnings("deprecation")
	@Test
	public void multiplyで3と4の乗算結果が取得できる() {
		Calculator calc = new Calculator();
		int expected = 12;
		int actual = calc.multiply(3, 4);
		assertThat(actual, is(expected));
	}

	@SuppressWarnings("deprecation")
	@Test
	public void multiplyで5と7の乗算結果が取得できる() {
		Calculator calc = new Calculator();
		int expected = 35;
		int actual = calc.multiply(5, 7);
		assertThat(actual, is(expected));
	}

	@SuppressWarnings("deprecation")
	@Test
	public void multiplyで3と2の除算結果が取得できる() {
		Calculator calc = new Calculator();
		float expected = 1.5f;
		float actual = calc.divide(3, 2);
		assertThat(actual, is(expected));
	}

	@Test(expected = IllegalArgumentException.class)
	public void dicideで5と０のときIllegalArgumentExceptionを送出する() {
		Calculator calc = new Calculator();
		calc.divide(5, 0);
	}

	//assertThatによる比較検証
	@SuppressWarnings("deprecation")
	@Test
	public void assertion() {
		String actual = "Hello" + " " + "World";
		assertThat(actual, is("Hello World"));
	}

}

//Testアノテーションの利用サンプルｐ59
//	@Test
//	public void addに3と4を与えると7を返す() throws Exception {
//		//SetUp - 初期化 事前準備
//		Calculator sut = new Calculator();
//		sut.init();
//		//Exercise- テストの実行
//		int actual = sut.add(3, 4);
//		//Verify - 検証
//		assertThat(actual, is(7));
//		//TearDown - 後処理
//		sut.shutdown();
//	}
//Testアノテーションのexpected属性
//	@Test(expected = IllegalArgumentException.class)
//	public void 例外テスト() throws Exception {
//		sut.doSomething();
//	}
//
//}
