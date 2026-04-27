class Solution {
    public int maxProfit(int[] prices) {
        int minVal=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<prices.length;i++){
            //update min val
            if(prices[i]<minVal){
                minVal=prices[i];
            }
            
            //cal profit
            int profit=prices[i]-minVal;
            
            if(profit>maxProfit){
                maxProfit=profit;
            }
        }
        return maxProfit;
    }
}
