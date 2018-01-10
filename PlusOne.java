import java.util.Arrays;

class PlusOne {
    public static int[] plusOne(int[] digits) {
        int numDigits = digits.length;
        int flag = 0;
        for (int i = 0; i < numDigits; i++) {
            if (digits[i] != 9) {
                flag = 1;
            }
        }
        if (flag == 1) {
            int newArray[] = new int[numDigits];
            for (int i = numDigits - 1; i >= 0; i--) {
                int someValue = digits[i] + flag;
                if (someValue == 10) {
                    flag = 1;
                    newArray[i] = 0;
                } else {
                    newArray[i] = someValue;
                    flag = 0;
                }
            }
            return newArray;
        } else {
            int newArray[] = new int[numDigits + 1];
            newArray[0] = 1;
            for (int i = 1; i < newArray.length; i++) {
                newArray[i] = 0;
            }
            return newArray;
        }
    }

    public static void main(String args[]) {
        int someArray[] = { 9, 8, 9, 9};
        System.out.println(Arrays.toString(plusOne(someArray)));
    }
}