class Solution {
    public int[] plusOne(int[] digits) {

        int[] a = new int[digits.length + 1];
        a[0] = 1;

        for(int i = digits.length -1; i >= 0; i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
            
        }
        
        return a;
    }
}