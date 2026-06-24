class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> y = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            int x = target - nums[i];
            if (y.containsKey(x)){
                return new int[]{i, y.get(x)};
            }
            else{
                y.put(nums[i], i);
            }
        }
        return new int[]{};
    }
}