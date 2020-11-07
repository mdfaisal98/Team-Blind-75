class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> seen_elements = new HashMap<>();
        int[] res_index = new int[2];
        
        for(int i=0;i<nums.length;i++){
            int ele = nums[i];
            if(seen_elements.containsKey(target-ele)){
                res_index[0] = seen_elements.get(target-ele);
                res_index[1] = i;
                break;
            }
            seen_elements.put(ele,i);
        }
        
        return res_index;
    }
}