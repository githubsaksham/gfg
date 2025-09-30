class Solution {
    
    public void swap(int[] temp,int first, int last){
        int local = temp[first];
        temp[first]=temp[last];
        temp[last]=local;
    }
    public void reverseArray(int arr[]) {
        // code here
        int length= arr.length;
        int n = arr.length-1;
         
        for(int i=0;i<length/2;i++){
            swap(arr,i,n-i);
        }
        
        
    }
}