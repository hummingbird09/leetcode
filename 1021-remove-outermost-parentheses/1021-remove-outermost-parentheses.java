class Solution {
    public String removeOuterParentheses(String s) {
        int level = 0;
        String str = "";
        for(int i = 0 ; i<s.length() ; i++){
            if(s.charAt(i) == '('){
                level++;
                if(level > 1){
                    str += s.charAt(i);
                }
            }
            else if (s.charAt(i) == ')'){
                level--;
                if(level>0){
                    str+=s.charAt(i);
                }
            }
        }

        return str;
    }
}