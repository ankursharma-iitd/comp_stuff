class Solution {
	public static boolean checkPalindrome(String s, int i, int j, int canDelete) {
		while (i <= j) {
			if (s.charAt(i) == s.charAt(j)) {
				i++;
				j--;
			} else if (canDelete == 1) {
				return (checkPalindrome(s, i + 1, j, 0) || checkPalindrome(s, i, j - 1, 0));
			} else {
				return false;
			}
		}
		return true;
	}

	public static boolean validPalindrome(String s) {
		int n = s.length();
		if (n == 0 || n == 1 || n == 2)
			return true;
		int i = 0;
		int j = n - 1;
		return checkPalindrome(s, i, j, 1);
	}

	public static void main(String args[]) {
		System.out.println(validPalindrome("abcdeba"));
	}
}