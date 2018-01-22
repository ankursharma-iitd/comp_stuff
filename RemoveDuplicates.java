import java.util.*;

class Solution {
    public static void removeDuplicates(ArrayList<Integer> a) {
        // if (a.size() <= 2)
        //     return a.size();
        int flag = 0;
        int tar2 = a.get(0);
        int tar1 = a.get(1);
        int j = 2;
        if (a.get(0) == a.get(2)) {
            j = 2;
        }
        // if(a.get(0) == a.get(1)){
        //     a.add(0,a.get(0));
        // }
        a.add(0, a.get(0));
        a.add(1,9); //for all zeros
        
        // int j = 2;
        int temp = -1;
        for (int i = 2; i < a.size(); i++) {
            tar2 = a.get(i - 2);
            if (i - 1 == j) {
                tar2 = temp;
            }
            if (!(a.get(i) == tar2)) {
                temp = a.get(j);
                a.set(j - 1, a.get(i));
                j++;
            }
        }
        // if(a.get(0) == a.get(2)){
        //     a.remove(0);
        // }

        for(int i = 0; i < j - 1; i++){
            System.out.print(a.get(i) + " ");
        }
        System.out.println();
        return;
        // return j - 1;
        // return j;
    }

    public static void main(String args[]){
        // ArrayList<Integer> al = new ArrayList<Integer>();
        int a[] = {0,0,0,1,2,3,4,4,4,4,5,5,5,6,6};
        // al.add(0);
        // al.add(0);
        // al.add(0);
        // al.add(0);
        // al.add(1);
        // al.add(1);
        // al.add(2);
        // al.add(3);
        // al.add(3);
        // al.add(3);
        // al.add(4);
        // al.add(4);
        // al.add(4);
        // al.add(4);
        // al.add(5);
        ArrayList<Integer> al = new ArrayList<Integer>();
        for (int i = 0; i < a.length; i++) {
            al.add(a[i]);
        }
        System.out.println(al.toString());
        removeDuplicates(al);
    }
}
