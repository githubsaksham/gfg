class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        int length = arr.length;
        int max=arr[0];
        int min=arr[0];
        
        
        ArrayList<Integer> list = new ArrayList<>();
        
        
        for(int i=1;i<length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            else if(arr[i]<min){
                min=arr[i];
            }
        }
        list.add(min);
        list.add(max);
        
        return list;
        
        
        
    }
}
