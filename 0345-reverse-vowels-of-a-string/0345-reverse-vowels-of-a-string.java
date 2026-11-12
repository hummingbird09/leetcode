class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int a = 0;
        int b = arr.length - 1;
        
        while (a < b) {
           
            while (a < b && !isVowel(arr[a])) {
                a++;
            }
            
            while (a < b && !isVowel(arr[b])) {
                b--;
            }
            
           
            char temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
            
            a++;
            b--;
        }
        
        return new String(arr);
    }
    
    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
               c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}