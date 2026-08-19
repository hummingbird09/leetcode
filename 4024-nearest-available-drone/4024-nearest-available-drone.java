class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        HashMap<Integer , Integer> map = new HashMap<>();
        
        for(int i = 0 ; i<drones.length ; i++){
            int tIndex = 0;
            int index = i;
            int dist = 0;
            int range = drones[i][2];
            for(int j = 0 ; j<drones[i].length-1 ; j++){
                 dist += Math.abs(drones[i][j] - target[tIndex] );
                 tIndex++;
                 
            }

            if(dist <= range){
                    map.put(index , dist);
             }
        }


        int min = Integer.MAX_VALUE;
        int minIndex = 0;
        if(map.isEmpty()){
            return -1;
        }

        for(Map.Entry<Integer , Integer> freq : map.entrySet()){
            if(freq.getValue() < min ){
                min = freq.getValue();
                minIndex = freq.getKey();
            }

        }

        return minIndex;
        
    }
}