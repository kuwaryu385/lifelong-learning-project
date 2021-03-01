package junit.tutorial;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import junittutorial.Counter;

@RunWith(Enclosed.class)
public class CounterTest {

	public static class 初期状態の場合 {
		Counter sut;

		@Before
		public void setUp() {
			sut = new Counter();
		}

		@SuppressWarnings("deprecation")
		@Test
		public void incrementで1が取得できる() {
			assertThat(sut.increment(), is(1));
		}
	}

	public static class incrementが1回実行された場合 {
		Counter sut;

		@Before
		public void setUp() {
			sut = new Counter();
			sut.increment();
		}

		@SuppressWarnings("deprecation")
		@Test
		public void incrementで２が取得できる() {
			assertThat(sut.increment(), is(2));
		}
	}

	public static class incrementが50回実行された場合 {
		Counter sut;

		@Before
		public void setUp() {
			sut = new Counter();
			for (int i = 0; i < 50; i++)
				sut.increment();
		}

		@SuppressWarnings("deprecation")
		@Test
		public void incrementで51が取得できる() {
			assertThat(sut.increment(), is(51));
		}
	}

}
