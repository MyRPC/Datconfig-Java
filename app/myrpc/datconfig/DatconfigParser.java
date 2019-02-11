package app.myrpc.datconfig;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DatconfigParser {
	private boolean comments;

	public DatconfigParser(boolean allowComments) {
		comments = !!allowComments;
	}

	public parse(String code) {
		if (code.matches(Patterns.COMMENT) && !comments)
	}

	private String[] pareLine(String line) {
		Matcher valueMatcher = Pattern.compile(Patterns.BODY).matcher(line);
		String value = valueMatcher.group(0);

	}

	private class Patterns {
		public static final String BODY = "^[\\w\\d]+(?:\\:[\\w\\d]+)+";
		public static final String COMMENT = "[ \\t]*(?:\\/\\/.*\\/\\/|\\/.*$)[[ \\t]*";
	}
}