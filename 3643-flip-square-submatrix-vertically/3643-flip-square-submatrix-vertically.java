class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int length = grid.length-1;
        while(x<length){
            swapTheMatrix(grid,x,y,k,length);
            x++;
            length--;
        }
        
        return grid;
    }
    public void swapTheMatrix(int[][] grid, int x,int y,int k,int length){
        while(k-->0){
            int temp = grid[x][y];
            grid[x][y] = grid[length][y];
            grid[length][y] = temp;
            y++;
        }
    }
}