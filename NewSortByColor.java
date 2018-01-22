import java.util.ArrayList;

class Solution{
    public static void sortColors(ArrayList<Integer> a){
        int n = a.size();
        //n denotes the length of the arraylist of integers
        if(n == 1 || n == 0){
            return;
        }
        a.add(3);
        int i = 0;
        while(true){
            int someTerm = a.get(i);
            if(someTerm == 3) break;
            if(someTerm == 0){
                a.remove(i);
                a.add(0, 0);
            }
            else if(someTerm == 2){
                a.remove(i);
                a.add(2);
                i--;
            }
            // System.out.println(a.toString());
            i++;
        }
        System.out.println(a.toString());
        return;
    }
    public static void main(String args[]){
        int a[] ={ 1, 0, 0, 1, 1, 0, 0, 2, 1, 2, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 0, 0, 2, 0, 2, 2, 2, 0, 0, 1, 1, 1, 2, 2, 0, 2, 2, 2, 2, 2, 1, 1, 2, 2, 2, 1, 2, 1, 1, 0, 0, 1, 2, 1, 1, 0, 1, 0, 2, 0, 2, 1, 0, 1, 1, 0, 0, 1, 2, 0, 1, 0, 2, 1, 0, 1, 0, 1, 0, 1, 2, 2, 2, 0, 1, 1, 0, 2, 2, 2, 0, 0, 0, 0, 1, 1, 2, 1, 0, 1, 0, 1, 2, 2, 1, 0, 2, 0, 0, 1, 2, 1, 0, 2, 1, 0, 2, 0, 2, 1, 1, 1, 1, 1, 0, 1, 2, 0, 0, 1, 0, 1, 2, 0, 1, 1, 2, 1, 0, 2, 0, 0, 0, 2, 0, 1, 0, 2, 1, 1, 0, 1, 2, 1, 0, 0};
        ArrayList<Integer> something = new ArrayList<Integer>();
        for(int i = 0; i < a.length; i++){
            something.add(a[i]);
        }
        sortColors(something);
    }
}