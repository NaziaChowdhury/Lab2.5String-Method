import java.util.*;

class StringLab {

	public static void main(String[] args) {
		StringLab ob = new StringLab();
		StringMethods ob2 = new StringMethods();
		System.out.println(ob2.capitalize("heLLO"));
		System.out.println(ob2.wheresWaldo("Striped Waldo!"));
		System.out.println(ob2.firstThingsFirst("cat", "dog"));
		System.out.println(ob2.reverse("happy"));
		ob2.soLong("bean", "peal");
		System.out.println(ob2.afterMath("“She aced the test!"));
		ob2.letterize("java");
		System.out.println(ob2.camelCase("    desert survival skills"));
	}
}

class StringMethods {
	String capitalize(String word) {
		String ans = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
		return ans;
	}

	int wheresWaldo(String phrase) {
		return phrase.indexOf("Waldo");
	}

	String firstThingsFirst(String a, String b) {
		int x = a.compareTo(b);
		if (x < 0) {
			String ans = a + " " + b;
			return ans;

		} else if (x > 0) {
			String ans = b + " " + a;
			return ans;
		} else
			return null;
	}

	String reverse(String word) {
		String ss = new StringBuilder(word).reverse().toString();
		return ss;
	}

	void soLong(String a, String b) {
		int lena = a.length();
		int lenb = b.length();
		if (lena > lenb) {
			System.out.println(a);
		} else if (lenb > lena) {
			System.out.println(b);
		} else {
			String ans = a + " " + b;
			System.out.println(ans);

		}

	}

	String afterMath(String phrase) {
		int ind = phrase.indexOf("math");
		if (ind == -1) {
			return "dud";
		} else {
			return phrase.substring(ind);
		}
	}

	void letterize(String word) {
		for (int i = 0; i < word.length(); i++) {
			System.out.println(word.charAt(i));
		}
	}

	String camelCase(String phrase) {
		StringBuilder sb = new StringBuilder();
		int ind = 0;
		for (int i = 0; i < phrase.length(); i++) {
			if (Character.isLetter((phrase.charAt(i)))) {
				ind = i;
				break;
			}
		}
		boolean nextCapital = false;
		for (int i = ind; i < phrase.length(); i++) {
			if (Character.isLetter(phrase.charAt(i))) {
				char tmp = phrase.charAt((i));
				if (nextCapital == true) {
					tmp = Character.toUpperCase(tmp);
				} else if (nextCapital == false) {
					tmp = Character.toLowerCase(tmp);
				}
				sb.append(tmp);
				nextCapital = false;
			} else {
				nextCapital = true;
			}

		}
		return sb.toString();
	}
}