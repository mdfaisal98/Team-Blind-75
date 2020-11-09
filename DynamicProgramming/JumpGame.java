class Solution {
    
    public boolean canJump(int[] nums) {
        
        int index = nums.length-1;
        
        for(int i=index;i>=0;i--){
            if(i + nums[i] >= index)    // Keeping track of the index from which the last index is reachable.
                index = i;
        }
        
        return (index == 0)?true:false;       
    }
}