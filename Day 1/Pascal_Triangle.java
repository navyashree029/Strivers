// Leetcode
class Solution {
    public List<Integer> generateRows(int row){
        long ans=1;
        List<Integer> Row=new ArrayList<>();
        Row.add(1);

        for(int col=1;col<row;col++){
            ans=ans*(row-col);
            ans=ans/col;
            Row.add((int)ans);
        }
        return Row;

        }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> temp=new ArrayList<>();
        for(int row=1;row<=numRows;row++){
            temp.add(generateRows(row));
        }
        return temp;

        
    }
}




// Coding Ninjas
import java.util.*;
public class Solution {
     public static int[] generateRows(int row){
         long ans=1;
         int[] Row=new int[row];
         Row[0]=1;

         for(int col=1;col<row;col++)
         {
             ans=ans*(row-col);
             ans=ans/col;
             Row[col]=(int)ans;


         }
         return Row;
     }
      
    public static int[][] pascalTriangle(int N) {
        // Write your code here.
        int[][] temp=new int[N][];
        for(int row=0;row<N;row++)
        {
            temp[row]=generateRows(row+1);
        }
        return temp;
    }
}