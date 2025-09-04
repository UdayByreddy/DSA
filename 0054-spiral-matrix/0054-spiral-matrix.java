class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int rowStart =0,colStart=0;
        int rowEnd = matrix.length;
        int colEnd = matrix[0].length;
        List<Integer> arr = new ArrayList<>();
        while(rowStart<rowEnd && colStart<colEnd){
            for(int i=colStart;i<colEnd;i++){
                arr.add(matrix[rowStart][i]);
            }
            rowStart++;
            for(int j=rowStart;j<rowEnd;j++){
                arr.add(matrix[j][colEnd-1]);
            }
            colEnd--;
            if(rowStart<rowEnd){
                for(int i=colEnd-1;i>=colStart;i--){
                    arr.add(matrix[rowEnd-1][i]);
                }
               rowEnd--; 
            }
            if(colStart<colEnd){
                for(int j=rowEnd-1;j>=rowStart;j--){
                    arr.add(matrix[j][colStart]);
                }
                colStart++;
            }
        }
         return arr;
    }
}