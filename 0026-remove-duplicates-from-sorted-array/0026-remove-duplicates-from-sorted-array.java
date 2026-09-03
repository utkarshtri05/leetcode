class Solution {
    public int removeDuplicates(int[] nums) {
        int uni=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                uni+=1;
                nums[uni-1]=nums[i];
            }

        }
        return uni;
        
    }
}