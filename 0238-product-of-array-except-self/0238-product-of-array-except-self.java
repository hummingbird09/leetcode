class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr = new int[nums.length];
        int prod = nums[0];

        int count =0;

        for(int i = 0 ; i<nums.length; i++){
            if(nums[i] ==0){
                count++;
            }
            
            
        }

        if(count >=2){
            Arrays.fill(arr,0);
            return arr;
        }
       

        for(int i = 1 ; i<nums.length; i++){
            prod = prod*nums[i];
        }


        for(int i = 0 ; i<nums.length; i++){

            if(prod !=0){
                arr[i] = prod/nums[i];
            }
            
            
        }

        int prod2 = 1;
        for(int i = 0 ; i<nums.length; i++){
            if(nums[i] != 0){
                prod2 = prod2*nums[i]; 
            }
            
        }


         for(int i = 0 ; i<nums.length; i++){

           if(prod == 0){
                if(nums[i]!=0){
                    arr[i] = 0;
                }
                else{
                    arr[i] = prod2;
                }
           }
           else{
            continue;
           }
            
        }



        return arr;
    }
}