class Solution {
    public int reverse(int x) {
        String str = Integer.toString(x);
        char[] chars = str.toCharArray();
        for(int i=0; i<chars.length;i++){
            if(chars[i] == '0'){
                chars[i] = ' ';
            }
        }
        Strign newString = new String(chars);
        newString = newString.trim();
        StringBuilder something = new StringBuilder()l
        something.append(newString);
        something.reverse();
        newString = something.toString();
        char[] newchars = newString.toCharArray();
        for(int i=0; i<newchars.length; i++){
            if(newchars[i] == ' '){
                newchars[i] = '0';
            }
        }
        return Integer.parseInt(new String(newchars));
    }
}