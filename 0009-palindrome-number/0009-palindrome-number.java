class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int y = 0;
        int x1= x;
        while (x > 0){
            int ultimo = x % 10;
            y = (y*10) + ultimo;
            x = x /10;
        }
        if ( x1 == y){
            return true;
        }
        return false;
    }
}