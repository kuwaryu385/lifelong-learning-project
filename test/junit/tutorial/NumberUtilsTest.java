package junit.tutorial;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

import junittutorial.NumberUtils;

public class NumberUtilsTest {

	@SuppressWarnings("deprecation")
	@Test
	public void isEvenは10でtrueを返す() throws Exception {
		assertThat(NumberUtils.isEven(10), is(true));
	}

	@SuppressWarnings("deprecation")
	@Test
	public void isEvenは７でfalseを返す() throws Exception {
		assertThat(NumberUtils.isEven(7), is(false));
	}

}
