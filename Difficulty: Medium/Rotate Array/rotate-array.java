// User function Template for Java

class Solution {
    // User function Template for Java


    // Function to rotate an array by d elements in counter-clockwise direction.
    public static void swap(int arr[], int i,int j ){
        int temp= arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    
    static void rotateArr(int arr[], int d) {
        // add your code here
        int start=0;
        d=d%arr.length;
        if(d==0) return;
        
         int end=d-1;
        int local=d;
        
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
         end=arr.length-1;
        while(local<end){
            swap(arr,local,end);
            local++;
            end--;
        }
        int finish= 0;
        int last=arr.length-1;
        while(finish<last){
            swap(arr,finish,last);
            finish++;
            last--;
        }
         
    }
}
    
