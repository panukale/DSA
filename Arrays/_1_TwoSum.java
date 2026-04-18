class Solution {
    public int[] twoSum(int[] nums, int target) {
//1ST
//CHECK TARGET-ELE--->CONTAINS IN HASH
//IF YES -->RETURN INDEX OF TWO ELE
//ELSE --->ADD THE ELE TO THE HASH
//2,7,11,15 ---->9

        Map<Integer,Integer> twoSumCheck=new HashMap<>();
        for(int i=0;i<nums.length;i++){
                 int val=target-nums[i];
                 if(twoSumCheck.containsKey(val)){
                    return new int[]{twoSumCheck.get(val),i};
                 }else{
                    twoSumCheck.put(nums[i],i);
                 }
        }
        return null;
    }
}
