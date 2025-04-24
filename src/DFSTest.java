import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DFSTest {

    DFS dfs = new DFS();

    @Test
    public void testNumIslands() {
        char[][] grid = {
            {'1','1','0','0','0'},
            {'1','1','0','0','0'},
            {'0','0','1','0','0'},
            {'0','0','0','1','1'}
        };
        assertEquals(3, dfs.numIslands(grid));
    }

    @Test
    public void testFloodFill() {
        int[][] image = {
            {1,1,1},
            {1,1,0},
            {1,0,1}
        };
        int[][] expected = {
            {2,2,2},
            {2,2,0},
            {2,0,1}
        };
        assertArrayEquals(expected, dfs.floodFill(image, 1, 1, 2));
    }

    @Test
    public void testCountRooms() {
        int[][] grid = {
            {1,0,0,1},
            {1,1,0,0},
            {0,0,1,1},
            {0,0,1,0}
        };
        assertEquals(3, dfs.countRooms(grid));
    }

    @Test
    public void testMaxAreaOfIsland() {
        int[][] grid = {
            {0,0,1,0,0},
            {0,1,1,1,0},
            {0,0,1,0,0},
            {1,1,0,0,0}
        };
        assertEquals(5, dfs.maxAreaOfIsland(grid));
    }

    @Test
    public void testNumEnclaves() {
        int[][] grid = {
            {0,0,0,0},
            {1,0,1,0},
            {0,1,1,0},
            {0,0,0,0}
        };
        assertEquals(3, dfs.numEnclaves(grid));
    }

    @Test
    public void testSolve() {
        char[][] board = {
            {'X','X','X','X'},
            {'X','O','O','X'},
            {'X','X','O','X'},
            {'X','O','X','X'}
        };
        char[][] expected = {
            {'X','X','X','X'},
            {'X','X','X','X'},
            {'X','X','X','X'},
            {'X','O','X','X'}
        };
        dfs.solve(board);
        assertArrayEquals(expected, board);
    }

    @Test
    public void testExist() {
        char[][] board = {
            {'A','B','C','E'},
            {'S','F','C','S'},
            {'A','D','E','E'}
        };
        assertTrue(dfs.exist(board, "ABCCED"));
        assertFalse(dfs.exist(board, "ABCB"));
    }

    @Test
    public void testMinStepsToTreasure() {
        char[][] grid = {
            {'S','O','O','D'},
            {'D','O','D','O'},
            {'O','O','O','X'}
        };
        assertEquals(5, dfs.minStepsToTreasure(grid));
    }

    @Test
    public void testShortestBridge() {
        int[][] grid = {
            {0,1},
            {1,0}
        };
        assertEquals(1, dfs.shortestBridge(grid));
    }
}
