class Solution {
    public static String reverseWords(String a) {
        a = a.trim();
        int n = a.length();
        if(n == 0 || n == 1) return a;
        String reversedString = "";
        String oneword = "";
        int i = 0;
        int flag = 0;
        String somerandom = "";
        a = a + " ";
        while (true) {
            if (i == (n + 1)) {
                break;
            }
            char currentChar = a.charAt(i);
            if (currentChar != ' ') {
                oneword += Character.toString(currentChar);
                flag = 1;
            } else {
                if (flag == 1) {
                    somerandom = " ";
                    flag = 0;
                } else {
                    somerandom = "";
                }
                reversedString = oneword + somerandom + reversedString;
                oneword = "";
            }
            i++;
        }
        return reversedString.trim();
    }

    public static void main(String args[]) {
        System.out.println(reverseWords("  what the     fuck is this   "));
    }
}
