class Solution {
    public int majorityElement(int[] nums) {
        int number = nums[0];
        int cont = 0;
        for (int i = 0; i < nums.length; i++){
            
            if(cont == 0){
                number = nums[i];
            }

            if(nums[i] == number){
                cont++;
            }else{
                cont--;
            }
        }
        return number;
    }
}