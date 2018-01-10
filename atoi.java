class Solution {
    public int myAtoi(String str) {
        str = str.trim();
        char[] chars = str.toCharArray();
        char somechar = '@';
        int flag = 0;
        if(chars[0] == '+' || chars[0] == '-'){
            somechar = chars[0];
            flag = 1;
        }
        int count = 0;
        for(int i=flag; i<chars.length; i++){
            int currAscii = (int)chars[i];
            if(currAscii < 48 || currAscii > 57){
                break;
            }
            count++;
        }
        String s = new String(str, flag, count);
        Long someint = Long.parseLong(s);
        if(someint > Integer.MAX_VALUE && someint < Integer.MIN_VALUE) return 0;
        return someint;
    }
}