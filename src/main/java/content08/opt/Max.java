package content08.opt;

import java.util.*;

public class Max {

	// Returns maximum value in collection - throws exception if empty
	public static String max(Collection<String> collection) {
		if (collection == null || collection.isEmpty())
			throw new IllegalArgumentException("Empty collection");

		String result = null;
		for (String e : collection) {
			if (result == null || result.compareTo(e) > 0)
				result = Objects.requireNonNull(e);
		}

		return result;
	}

	// TODO
	public static String max1(Collection<String> collection) {
		if (collection == null || collection.isEmpty())
			throw new NullPointerException();

		String result = null;
		for (String e : collection) {
			if (result == null || result.compareTo(e) > 0)
				result = Objects.requireNonNull(e);
		}

		return result;
	}

	public static void main(String[] args) {

		// List<String> words = Arrays.asList("100", "20", "5");
		// List<String> words = null;
		// System.out.println(max1(words));

	}

}
