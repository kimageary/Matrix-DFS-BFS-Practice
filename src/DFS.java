

public class DFS {
    
    // Easier Problems 

        /**
         * Counts the number of disconnected islands (groups of '1's) in the grid.
         * An island is surrounded by water ('0') and is formed by connecting adjacent lands horizontally or vertically.
         *
         * @param grid 2D char grid consisting of '1's (land) and '0's (water)
         * @return the number of islands in the grid
         */
        public int numIslands(char[][] grid) {
            return 0;
        }

        /**
         * Performs a "flood fill" from the given start position by changing the color of the starting cell
         * and all 4-directionally connected cells of the same color to a new color.
         *
         * @param image 2D int grid representing pixel colors
         * @param sr starting row index
         * @param sc starting column index
         * @param newColor new color to apply
         * @return the modified image after flood fill
         */
        public int[][] floodFill(int[][] image, int sr, int sc, int newColor) { 
            return new int[][]{};
        }

        /**
         * Count the number of rooms in a matrix where each room is a group of connected 1's.
         * Walls are represented by 0's. Diagonals are NOT connected.
         *
         * @param grid 2D int matrix with 0's (wall) and 1's (room space)
         * @return number of distinct rooms
         */
        public int countRooms(int[][] grid) { 
            return 0;
        }





    // Medium Problems

        /**
         * Returns the size of the largest island in the grid.
         * An island is a group of 1's connected horizontally or vertically.
         *
         * @param grid 2D int grid consisting of 0's (water) and 1's (land)
         * @return the maximum area of any island
         */
        public int maxAreaOfIsland(int[][] grid) { 
            return 0;
        }

        /**
         * Returns the number of land cells (1's) that cannot reach the edge of the grid.
         * Land cells are considered "enclaved" if they are completely surrounded by water.
         *
         * @param grid 2D int grid with 0's (water) and 1's (land)
         * @return count of land cells that are enclosed
         */
        public int numEnclaves(int[][] grid) { 
            return 0;
        }

        /**
         * Modifies the input board in-place by flipping all surrounded regions of 'O' to 'X'.
         * A region is considered surrounded if it is completely enclosed by 'X' in all four directions.
         *
         * @param board 2D char grid containing 'X' and 'O'
         */
        public void solve(char[][] board) { }

        /**
         * Checks if a word exists in the board by searching for it via adjacent (up/down/left/right) characters.
         * Each letter must be used only once per path.
         *
         * @param board 2D char grid of letters
         * @param word the target word to search for
         * @return true if the word exists in the grid, false otherwise
         */
        public boolean exist(char[][] board, String word) { 
            return false;
        }



    // Harder Problems 

        /**
         * Finds the shortest path from 'S' to 'X' in a grid using DFS.
         * Grid contains 'S', 'X', 'O' (open), and 'D' (danger/blocked).
         *
         * @param grid 2D char grid
         * @return minimum number of steps from 'S' to 'X'
         */
        public int minStepsToTreasure(char[][] grid) { 
            return 0;
        }

        /**
         * Finds the shortest bridge (number of 0s to flip) to connect two separate islands in the grid.
         * Use DFS to mark one island and BFS to find the shortest path to the other.
         *
         * @param grid 2D int grid with two islands (1s) separated by water (0s)
         * @return the length of the shortest bridge between islands
         */
        public int shortestBridge(int[][] grid) { 
            return 0;
        }


}
