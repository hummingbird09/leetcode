class Solution {
    void nextPermutation(int[] arr) {
        int n = arr.length;
        int index = -1;
        for(int i = n-2; i>=0;i--){
            if(arr[i]<arr[i+1]){
                index = i;
                break;
            }
        }
        
        if(index==-1){
            reverse(arr,0,n-1);
            return;
        }
        
        for(int j = n-1;j>=0;j-- ){
            if(arr[index]<arr[j]){
            swap(arr,index,j);
            break;
            }
        }
        
        reverse(arr,index+1,n-1);
        // code here
    }
    
    
    
    static void reverse(int[] ans, int start, int end){
        while(start<end){
            swap(ans,start,end);
            start++;
            end--;
        }
    }
    
    static void swap( int[] filler , int a, int b ){
        int temp = filler[a];
        filler[a] = filler[b];
        filler[b] = temp;
    }
    
}