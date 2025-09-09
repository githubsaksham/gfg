class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int largest=Integer.MIN_VALUE;
        int smaller=Integer.MIN_VALUE;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                smaller=largest;
                largest=arr[i];
            }
            else if(smaller< arr[i] && largest!=arr[i]){
                smaller=arr[i];
            }
            
        }
        if(smaller==Integer.MIN_VALUE) return -1;
         return smaller;
         
        
    }
}