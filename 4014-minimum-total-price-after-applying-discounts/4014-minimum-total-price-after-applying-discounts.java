class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);
        int d = discounts.length;
        int p = prices.length;
        int index = d-1;
        double sum = 0.0;
        
        for(int i = p-1 ; i>=0 ; i-- ){
            if(index >= 0 ){
               sum +=  prices[i] *(100.0-discounts[index]) /100.0 ;
                index--;
            }
            else{
                sum += prices[i];
            }
        }

        return sum;
        
    }
}