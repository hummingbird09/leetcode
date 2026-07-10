class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList<Integer> rows = new ArrayList<>();

        ArrayList<Integer> cols = new ArrayList<>();
        
        for(int i = 0 ; i<matrix.length ; i++){
            for(int j = 0 ; j<matrix[i].length ; j++){
                if(matrix[i][j] == 0){
                    rows.add(i);
                    cols.add(j);
                }
            }
        }


        int numRows = matrix.length;
        int numCols = matrix[0].length;
         
        for(int r : rows) {
            makeRowsZero(matrix, r, numCols);
        }
        for(int c : cols) {
            makeColsZero(matrix, c, numRows);
        }
        


    }

    public static void makeRowsZero(int matrix[][] ,int r , int rows ){
        for(int i = 0 ; i<rows ;i++ ){
            matrix[r][i] = 0;
        }
    }

    public static void makeColsZero(int matrix[][] , int c , int cols ){
        for(int j = 0 ; j<cols ;j++ ){
            matrix[j][c] = 0;
        }
    }
}