class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
                List<Integer> result = new ArrayList<>();


        while (matrix.length > 0 && matrix[0].length > 0) {
            int columnLength = matrix[0].length;
            for (int i = 0; i < columnLength; i++) {
                result.add(matrix[0][i]);
            }
            for (int i = 1; i < matrix.length; i++) {
                result.add(matrix[i][columnLength - 1]);
            }

            if (matrix.length > 1) {
                for (int i = columnLength - 2; i > 0; i--) {
                    result.add(matrix[matrix.length - 1][i]);
                }
            }
            if (columnLength > 1) {
                for (int i = matrix.length - 1; i > 0; i--) {
                    result.add(matrix[i][0]);

                }
            }

            ArrayList<Integer> selectedRows = new ArrayList<>();
            ArrayList<Integer> selectedColumns = new ArrayList<>();


            for (int i = 1; i < matrix.length - 1; i++) {
                selectedRows.add(i);
            }
            for (int j = 1; j < columnLength - 1; j++) {
                selectedColumns.add(j);
            }

            int[][] filteredMatrix = new int[selectedRows.size()][selectedColumns.size()];
            for (int i = 0; i < selectedRows.size(); i++) {
                for (int j = 0; j < selectedColumns.size(); j++) {
                    filteredMatrix[i][j] = matrix[selectedRows.get(i)][selectedColumns.get(j)];
                }
            }
            matrix = filteredMatrix;
        }
        return result;
    }
}
