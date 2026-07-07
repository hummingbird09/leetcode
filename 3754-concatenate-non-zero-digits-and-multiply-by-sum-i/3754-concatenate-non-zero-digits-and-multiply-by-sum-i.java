class Solution {
    public long sumAndMultiply(int n) {
       String inWord = Integer.toString(n);
       String acceptable = "";
       for(char c : inWord.toCharArray()) {
            if(c!='0'){
                acceptable +=c;
            }
       }

       if (acceptable.isEmpty()) {
            return 0;
        }
       long ne = Long.parseLong(acceptable);
       long news = ne;
       long x = news;
       long sum = 0;
       while (news>0){
            sum  += news%10;
            news = news/10;
       }

        long result = x*sum;
       return result;
    }
}