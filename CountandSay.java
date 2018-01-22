class Solution {
    public static String getNewString(String someString){
        someString += "*";
        int n = someString.length();
        String partial = "";
        String answer = "";
        for (int i = 0; i < n - 1; i++) {
            // System.out.println(answer + "\n\n");
            char current = someString.charAt(i);
            char next = someString.charAt(i + 1);
            partial += Character.toString(current);
            if (current != next) {
                int partialLength = partial.length();
                answer += Integer.toString(partialLength) + Character.toString(partial.charAt(0));
                partial = "";
            }
        }
        return answer; // returns the answer
    }
    public static String countAndSay(int n) {
        String prev = "1";
        for(int i=2; i<=n; i++){
            prev = getNewString(prev);
        }
        return prev;
    }
    public static void main(String args[]){
        System.out.println(countAndSay(4));
    }
}