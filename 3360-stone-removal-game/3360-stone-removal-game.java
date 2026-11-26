class Solution {
    public boolean canAliceWin(int n) {
        boolean toggle = true;
        int counter = 10; 
        int turn = n-counter; // 19-10 = 9
        if(turn < 0){
            return false;
        }
        while(turn > 0){
                counter--;          //9
                turn = turn - counter;  // 0
                 if(turn >= 0){
                 toggle = !toggle;
                 }
                 
                
                
        }
        return toggle;
    }
}