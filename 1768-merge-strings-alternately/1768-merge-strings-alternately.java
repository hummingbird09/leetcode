class Solution {
    public String mergeAlternately(String word1, String word2) { 
        StringBuilder str = new StringBuilder();
        int temp = 0; 

        for (int i = 0; i < word1.length(); i++) {
            str.append(word1.charAt(i));
            if (temp < word2.length()) {
                str.append(word2.charAt(temp));
                temp++;
            }
        }

        while (temp < word2.length()) {
            str.append(word2.charAt(temp));
            temp++;
        }

        return str.toString();
    }
}
