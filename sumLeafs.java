import java.util.ArrayList;
import java.util.Iterator;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public ArrayList<String> getStrings(TreeNode root, ArrayList<String> someList){
        if(root == null) return someList;
        someList = addInFront(root.val, someList);
        ArrayList<String> leftStrings = addInFront(root.val, getStrings(root.left, new ArrayList<String>()));
        ArrayList<String> rightStrings = addInFront(root.val, getStrings(root.right, randomArrayList));
        ArrayList<String> allStrings = leftStrings.addAll(rightStrings);
    }
    public int sumNumbers(TreeNode root) {
        if(root == null) return 0;
        if(root.left == null && root.right == null) return root.val;
        ArrayList<String> randomArrayList = new ArrayList<String>();
        ArrayList<String> leftStrings = addInFront(root.val, getStrings(root.left, randomArrayList));
        ArrayList<String> rightStrings = addInFront(root.val, getStrings(root.right, randomArrayList));
        ArrayList<String> allStrings = leftStrings.addAll(rightStrings);
        Iterator<String> itr = allStrings.iterator();
        int sum = 0;
        while(itr.hasNext()){
            String someString = (String)itr.next();
            sum += Integer.parseInt(someString);
        }
        return sum;
    }
}