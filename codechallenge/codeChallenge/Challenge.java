package codeChallenge;

public class Challenge {

	public static void main(String[] args) {
		String longestString = null;
		int lengthForLongestString = 0;
		String str = "BABB";
		char[] caracteres = str.toCharArray();

		for (int i = 0; i < caracteres.length; i++) {
			if (lengthForLongestString == 0) {
				lengthForLongestString++;
				longestString += caracteres[i];
			} else {
				if (!longestString.indexOf(caracteres[i].string)) {
					longestString += caracteres[i];
					lengthForLongestString++;
				} else {
					lengthForLongestString++;
					longestString += caracteres[i];
					System.out.println("longestString = " + longestString.substring(1, lengthForLongestString));
					System.out.println("lengthForLongestString = " + (lengthForLongestString - 1));
					longestString = null;
					lengthForLongestString = 0;
				}
			}
		}

	}

}
