import java.util.*;
class Solution {
    public static int diffPossible(ArrayList<Integer> A, int k) {
        if(A.size() == 1 || A.size() == 0) return 0;
        if(A.size() == 2){
            int diff = A.get(1) - A.get(0);
            if(diff == k) return 1;
            else return 0;
        }
        int j = A.size() - 1;
        int i = A.size() - 2;
        int count  = 0;
        while(true){
            // if(count == 10) break;
            int wantNum = A.get(i) + k;
            if((A.get(A.size() - 1) - A.get(0)) < k) return 0;
            System.out.println("Wantnum : " + wantNum + ", i : " + i + ", j : " + j);
            if(i == 0 && j == 1) break;
            if(wantNum == A.get(j)){
                if(i != j){
                    return 1;
                }
            }
            if (j == i) {
                i--;
            }

            if((j + 1 < A.size()) && wantNum > A.get(j) && wantNum < A.get(j + 1)){
                if(i == 0) break;
                i--;
            }
            if(wantNum > A.get(j)){
                if(j < A.size() - 1){
                    j++;
                }
                else{
                    i--;
                }
            }
            if(wantNum < A.get(j)){
                if(j > i){
                    j--;
                }
            }
            // count++;
        }
        return 0;
    }
    public static void main(String args[]){
        int a[] = { 1, 2, 4, 5, 6, 9, 11, 21, 23};
        ArrayList<Integer> al = new ArrayList<Integer>();
        for (int i = 0; i < a.length; i++) {
            al.add(a[i]);
        }
        System.out.println(al.toString());
        System.out.println(diffPossible(al, 0));
    }
}
