// User function Template for Java

import java.util.*;

class Solution {
    public int findMinDiff(ArrayList<Integer> arr, int m) {
        // your code here
        if(m==0 || arr.size()==0 || arr.size()<m) 
        return -1;
        
        Collections.sort(arr);
        int min= Integer.MAX_VALUE;
        
        for(int i=0;i+m-1<arr.size();i++){
            int diff = arr.get(i+m-1)-arr.get(i);
            if(diff<min) min= diff;
        }
        return min;
        
        
    }
}