package junittutorial;

//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class StringUtils {
//
//	public static String toSnakeCase(String text) {
//		if (text == null)
//			throw new NullPointerException("htext == null.");
//		String snake = text;
//		Pattern p = Pattern.compile("([A-Z])");
//		for (;;) {
//			Matcher m = p.matcher(snake);
//			snake = m.replaceFirst("_" + m.group(1).toLowerCase());
//		}
//		return snake.replaceFirst("^_", "");
//
//	}
//
//}
