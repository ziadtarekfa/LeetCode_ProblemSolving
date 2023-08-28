class Solution {
    public void setZeroes(int[][] matrix) {
        Set<Integer> rows = new HashSet<>();
        Set<Integer> columns = new HashSet<>();
        int numOfColumns = matrix[0].length;
        for(int i=0 ; i < matrix.length;i++){
            for(int j =0 ; j < numOfColumns ;j++){
                if(matrix[i][j] ==0){
                    rows.add(i);
                    columns.add(j);
                }
            }
        }
        if(rows.isEmpty() && columns.isEmpty()){
            return;
        }

        for(int row:rows){
            for(int i=0;i<numOfColumns;i++){
                matrix[row][i] = 0;
            }
        }
        for(int column:columns){
            for(int i=0;i< matrix.length;i++){
                matrix[i][column] = 0;
            }
        }
    }
}