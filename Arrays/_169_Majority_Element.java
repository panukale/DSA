class Solution {
    public int majorityElement(int[] nums) {
         
        int count=0;
        int current=-1;
        for(int val:nums){
            if(current!=val&&count==0){
                current=val;
            }else if(current==val){
                count++;
            }else{
                count--;
            }
        }
        
        return current;
    }
}
