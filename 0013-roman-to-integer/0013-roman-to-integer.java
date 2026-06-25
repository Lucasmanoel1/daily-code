class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> mapa = new HashMap<>();
        mapa.put('I', 1);
        mapa.put('V', 5);
        mapa.put('X', 10);
        mapa.put('L', 50);
        mapa.put('C', 100);
        mapa.put('D', 500);
        mapa.put('M', 1000);

        char[] c = s.toCharArray();
        int k = 0;
        for(int i=0;i<s.length();i++){
            if(i + 1 < s.length() && mapa.get(c[i]) < mapa.get(c[i + 1])){
                k -= mapa.get(c[i]);
            }
            else{
                k += mapa.get(c[i]);
            }
        }
        return k;
    }
}