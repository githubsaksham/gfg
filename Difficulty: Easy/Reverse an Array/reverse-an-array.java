class Solution {
    public void swap(int arr[], int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    
    
    
    public void reverseArray(int arr[]) {
        // code here
        int start=0;
        int end=arr.length-1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
        
    }
}