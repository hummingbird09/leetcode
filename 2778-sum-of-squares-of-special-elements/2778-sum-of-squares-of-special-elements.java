class Solution {
    public int sumOfSquares(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] newNums = new int[nums.length+1];
        newNums[0] = 0;
        for(int i = 1; i<newNums.length ; i++ ){
            newNums[i] = nums[i-1];
        }

        int n = nums.length;
        for(int i = 1 ; i<newNums.length ; i++ ){
            if( n % i==0){
                list.add(newNums[i]);
            }
        }
        int sum = 0;

        for(int nm : list){
            sum += nm*nm;
        }

        return sum;
    }
}