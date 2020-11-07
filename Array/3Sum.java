class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        
        List<List<Integer>> res = new ArrayList<>();
        
        for(int i=0;i<nums.length;i++) {
            int left=i+1 ,right = nums.length-1;
            if(i>0 && nums[i] == nums[i-1]) continue;

            while(left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0)
                {
                    ArrayList<Integer> sub = new ArrayList<>();
                    sub.add(nums[i]);
                    sub.add(nums[left]);
                    sub.add(nums[right]);
                    res.add(sub);

                    while (left < right && nums[left] == nums[left+1])    // Skip duplicates from left 
                        left++;

                    while (left < right && nums[right] == nums[right-1])    // Skip duplicates from right
                        right--;

                    left++;
                    right--;
                }
                else if(sum > 0)
                    right--;
                else
                    left++;
            }
        }
        
        return res;
    }
}