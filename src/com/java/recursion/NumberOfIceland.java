package com.java.recursion;

public class NumberOfIceland {
    public static void main(String[] args) {
        int[][] grid = {
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 1, 1, 0, 1},
                {1, 1, 1, 0, 1}
        };
        System.out.println(numIslands(grid));
    }


    public static int numIslands(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    dfs(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }

    private static void dfs(int[][] grid, int x, int y) {
        if (isSafe(grid, x, y)) {
            grid[x][y] = 2;           // mark as visited
            dfs(grid, x + 1, y);    // bottom
            dfs(grid, x, y + 1);    // right
            dfs(grid, x - 1, y);    // top
            dfs(grid, x, y - 1);    // left
        }
    }

    private static boolean isSafe(int[][] grid, int x, int y) {
        return x >= 0 && y >= 0 && x < grid.length && y < grid[0].length && grid[x][y] == 1;
    }

}