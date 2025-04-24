import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BFSTest {

    BFS bfs = new BFS();

    @Test
    void testUpdateMatrix() {
        int[][] input = {
            {0, 0, 0},
            {0, 1, 0},
            {1, 1, 1}
        };
        int[][] expected = {
            {0, 0, 0},
            {0, 1, 0},
            {1, 2, 1}
        };
        assertArrayEquals(expected, bfs.updateMatrix(input));
    }

    @Test
    void testNearestExit() {
        char[][] maze = {
            {'+', '+', '.', '+'},
            {'.', '.', '.', '+'},
            {'+', '+', '+', '.'}
        };
        int[] entrance = {1, 2};
        assertEquals(1, bfs.nearestExit(maze, entrance));
    }

    @Test
    void testFloodFillSteps() {
        int[][] grid = {
            {1, 1, 1},
            {1, 1, 0},
            {1, 0, 1}
        };
        assertEquals(2, bfs.floodFillSteps(grid, 1, 1));
    }

    @Test
    void testOrangesRotting() {
        int[][] grid = {
            {2, 1, 1},
            {1, 1, 0},
            {0, 1, 1}
        };
        assertEquals(4, bfs.orangesRotting(grid));
    }

    @Test
    void testShortestPathBinaryMatrix() {
        int[][] grid = {
            {0, 1},
            {1, 0}
        };
        assertEquals(2, bfs.shortestPathBinaryMatrix(grid));
    }

    @Test
    void testOpenLock() {
        String[] deadends = {"0201","0101","0102","1212","2002"};
        String target = "0202";
        assertEquals(6, bfs.openLock(deadends, target));
    }

    @Test
    void testWallsAndGates() {
        int INF = Integer.MAX_VALUE;
        int[][] rooms = {
            {INF, -1,  0, INF},
            {INF, INF, INF, -1},
            {INF, -1, INF, -1},
            {0,   -1, INF, INF}
        };
        int[][] expected = {
            {3, -1,  0, 1},
            {2, 2, 1, -1},
            {1, -1, 2, -1},
            {0, -1, 3, 4}
        };
        bfs.wallsAndGates(rooms);
        assertArrayEquals(expected, rooms);
    }

    @Test
    void testSlidingPuzzle() {
        int[][] board = {
            {1, 2, 3},
            {4, 0, 5}
        };
        assertEquals(1, bfs.slidingPuzzle(board));
    }

    @Test
    void testKnightsShortestPath() {
        int boardSize = 8;
        int[] start = {0, 0};
        int[] target = {7, 7};
        assertEquals(6, bfs.knightsShortestPath(boardSize, start, target));
    }
}
