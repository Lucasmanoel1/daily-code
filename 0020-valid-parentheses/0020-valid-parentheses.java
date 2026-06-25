class Solution {
    public boolean isValid(String s) {
        Stack pilha = new Stack();
        char[] c = s.toCharArray();
        HashMap<Character, Character> mapa = new HashMap<>();
        mapa.put(']','[');
        mapa.put('}','{');
        mapa.put(')','(');

        for(int i = 0; i<s.length();i++){
            if(mapa.containsValue(c[i])){
                pilha.push(c[i]);
            }
            else if(mapa.containsKey(c[i]) && pilha.isEmpty()){
                return false;
            }
            else if(mapa.containsKey(c[i]) 
                    && pilha.peek().equals(mapa.get(c[i]))){
                pilha.pop();
            }else{
                return false;
            }
        }
        return pilha.isEmpty();
    }
}