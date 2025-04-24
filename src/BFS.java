public class BFS {

    // Easier Problems
    
        /**
         * For each cell containing 1, find the distance to the nearest 0 using BFS.
         *
         * @param mat 2D int grid with 0's and 1's
         * @return matrix of the same size where each cell contains the distance to the nearest 0
         */
        public int[][] updateMatrix(int[][] mat) {
            return new int[0][0];
        }
        /**
         * Returns the number of steps to the nearest exit ('.') from the entrance.
         * The maze is a grid with '+' as walls and '.' as empty space.
         *
         * @param maze 2D char grid
         * @param entrance int array [row, col]
         * @return minimum number of steps to nearest exit, or -1 if unreachable
         */
        public int nearestExit(char[][] maze, int[] entrance) {
            return -1;
        }

        /**
         * Similar to flood fill (in DFS.java), but return the number of steps it takes to fully spread color.
         *
         * @param grid 2D int grid (e.g., 1 = original color, 2 = new color)
         * @param sr starting row
         * @param sc starting column
         * @return number of steps to complete flood
         */
        public int floodFillSteps(int[][] grid, int sr, int sc) {
            return -1;
        }


    
    // Medium Problems

        /**
         * Each minute, fresh oranges (1) next to rotten oranges (2) rot.
         * Return the minimum number of minutes to rot all oranges, or -1 if not possible.
         *
         * @param grid 2D int grid
         * @return minutes to rot all oranges
         */
        public int orangesRotting(int[][] grid) {
            return -1;
        }

        /**
         * Finds the shortest clear path in a binary matrix from top-left to bottom-right.
         * 0 = open, 1 = blocked. Diagonal movement allowed.
         *
         * @param grid 2D int matrix
         * @return length of the shortest path or -1 if not possible
         */
        public int shortestPathBinaryMatrix(int[][] grid) {
            return -1;
        }

        /**
         * Given a lock with 4 wheels (digits 0-9), find the minimum moves to reach the target.
         * You can rotate one wheel up/down at a time. Avoid deadends.
         *
         * @param deadends array of deadend combinations
         * @param target the goal lock combination
         * @return minimum number of turns, or -1 if unreachable
         */
        public int openLock(String[] deadends, String target) {
            return -1;
        }

    // Harder Problems
        
        /**
         * Fill each empty room (value = Integer.MAX_VALUE) with the distance to its nearest gate (value = 0).
         * If a gate is unreachable, leave the room as is.
         *
         * @param rooms 2D int grid
         */
        public void wallsAndGates(int[][] rooms) { }

        /**
         * Solves the 2x3 sliding puzzle by returning the minimum number of moves to reach the solved state.
         * Solved state = [[1,2,3],[4,5,0]]
         *
         * @param board 2D int grid representing puzzle state
         * @return min number of moves to solve, or -1 if unsolvable
         */
        public int slidingPuzzle(int[][] board) {
            return -1;
        }       

        /**
         * Finds the shortest path for a knight to reach a target cell from a starting cell in a chessboard.
         *
         * @param boardSize size of the board (NxN)
         * @param start int array [row, col]
         * @param target int array [row, col]
         * @return minimum number of knight moves, or -1 if unreachable
         */
        public int knightsShortestPath(int boardSize, int[] start, int[] target) {
            return -1;
        }


}
