import java.util.ArrayList;
import java.util.Arrays;

class Solution {
	public static void sortColors(ArrayList<Integer> a) {
        if(a.size() == 0 || a.size() == 1) return;
        int i = -1; //i-pointer denotes the last red
        int j = -1; //j-pointer denotes the position of the last whte
        int p = -1;
        //sort by red, then white, then blue
        //red - 0, white - 1, blue - 2
        int k = 0;
        for(int ii=0; ii<a.size();ii++){
            int something = a.get(ii);
            if(something == 0){
                // i = ii;
                a.add(0, 0);
                a.remove(ii);
                break;
            }
        }
        for (int ii = 0; ii < a.size(); ii++) {
            int something = a.get(ii);
            if (something == 1) {
                // j = ii;
                a.add(1, 1);
                a.remove(ii);
                break;
            }
        }
        for (int ii = 0; ii < a.size(); ii++) {
            int something = a.get(ii);
            if (something == 2) {
                // p = ii;
                a.add(2, 2);
                a.remove(ii);
                break;
            }
        }
	    while(k < a.size()){
            System.out.println(a.toString());
            System.out.println("i = " + i + ", j = " + j + ", p = " + p);
            System.out.println("k = " + k + "\n\n");
            int someElement = a.get(k);
            if(someElement == 0){
                i++;
                a.remove(k);
                a.add(i, someElement);
                if(j != -1 && p != -1){
                    j = Math.max(j + 1, i + 1);
                    p = Math.max(p + 1, j + 1);
                }
            }
            else if(someElement == 1){
                if(j != -1){
                    j++;
                    a.remove(k);
                    a.add(j, someElement);
                    j = Math.max(j, i + 1);
                    p = Math.max(p, j + 1);
                }
                else{
                    j = Math.max(j, i + 1);
                }
            }
            else{
                if(p != -1){
                    p++;
                    a.remove(k);
                    a.add(p, someElement);
                    j = Math.max(j, i + 1);
                    p = Math.max(p, j + 1);
                }
                else{
                    j = Math.max(j, i + 1);
                    p = Math.max(p, j + 1);
                }
            }
            k++;
        }
        System.out.println(a.toString());
        return;
    }
    public static void main(String args[]) {
        int a[] = {2, 0, 0, 1, 0, 0, 2, 2, 1, 1, 0, 0, 1, 0, 2, 1, 1, 0, 1, 0, 1, 2, 2, 2, 0, 0, 1, 0, 2, 1, 1, 2, 1, 2, 2, 1, 0, 2, 2, 1, 1, 1, 0, 1, 0, 1, 0, 2, 1, 2, 0, 2, 0, 1, 1, 0, 2, 2, 1, 2, 0, 2, 1, 1, 1, 2, 0, 1, 0, 2, 2, 1, 0, 0, 1, 0, 1, 0, 0, 0, 1, 2, 1, 1, 0, 2, 1, 2, 0, 0, 0, 2, 2, 2, 2, 0, 0, 0, 1, 1, 0, 2, 1, 2, 2, 2, 1, 2, 2, 0, 1, 0, 1, 2, 1, 1, 0, 1, 2, 0, 1, 0, 2, 2, 1, 2, 1, 0, 2, 2, 1, 1, 0, 2, 1, 2};
        ArrayList<Integer> some = new ArrayList<Integer>();
        for(int i=0; i<a.length; i++){
            some.add(a[i]);
        }
        sortColors(some);
    }
}
