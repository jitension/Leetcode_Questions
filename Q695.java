/* 695. Max Area of Island
Given a non-empty 2D array grid of 0's and 1's, an island is a group of 1's (representing land) connected 4-directionally (horizontal or vertical.) You may assume all four edges of the grid are surrounded by water.

Find the maximum area of an island in the given 2D array. (If there is no island, the maximum area is 0.)
*?

import java.util.*;
class Solution {
    boolean[][] seen;
    int[][] grid;
    
    public int maxArea(int r , int c){
        
        if(r < 0 || r >= grid.length || c < 0 || c >= grid[0].length || grid[r][c] == 0 || seen[r][c])
            return 0;
        else{
            seen[r][c] = true;
            return (1 + maxArea(r+1,c) + maxArea(r,c+1) + maxArea(r-1,c) + maxArea(r,c-1));
        }
    }
    
  public int maxAreaOfIsland(int[][] grid) {
      this.grid = grid;
      int ans = 0;
      seen = new boolean[grid.length][grid[0].length];
        
        for(int r=0;r<grid.length;r++){
            for(int c=0;c<grid[0].length;c++){
                ans = Math.max(ans, maxArea(r , c));
            }
        }
        return ans;        
    }
}
