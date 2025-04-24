# DFS & BFS Algorithm Practice in Java

This repository contains practice problems and implementations of two fundamental graph traversal techniques: **Depth-First Search (DFS)** and **Breadth-First Search (BFS)**. These algorithms are frequently used in solving matrix/grid-based problems, and I have a feeling that this will likely be a topic that is covered on our midterm. I decided to compile a list of problems that should be a similar difficulty to what we have been doing in class. I also had ChatGPT write a test for each problem, so at the very least you have one example to look at/test with!


---

## 📘 Problem Overview

### ✅ BFS Problems (`BFS.java`)

- **01 Matrix** – Fill each cell with the distance to the nearest zero.
- **Nearest Exit from Maze** – Shortest path to any boundary cell from a starting point.
- **Flood Fill Steps** – Count steps to spread a new color across a region.
- **Rotting Oranges** – Track how rot spreads minute by minute.
- **Shortest Path in Binary Matrix** – Diagonal-allowed shortest path from top-left to bottom-right.
- **Open the Lock** – Minimum moves to reach a combination without hitting deadends.
- **Walls and Gates** – Fill rooms with distance to nearest gate.
- **Sliding Puzzle** – Solve a 2x3 board using BFS.
- **Knight's Shortest Path** – Minimum moves for a knight to reach a destination.

### ✅ DFS Problems (`DFS.java`)

- **Number of Islands** – Count distinct land masses.
- **Flood Fill** – Recolor a connected region.
- **Count Rooms** – Count the number of rooms.
- **Max Area of Island** – Largest connected group of 1s.
- **Number of Enclaves** – Find the amount of land that cannot reach the border.
- **Solve** – Flip all 'X' to 'O' in and vice versa in a grid. (in place)
- **Exist** – Checks if a word exists in the board.
- **Min Steps to Treasure** – Finds the shortest path from 'S' to 'X' in a grid using DFS.
- **Shortest Bridge** - Finds the shortest bridge (number of 0s to flip) to connect two separate islands in the grid.

---

## 🧠 DFS vs BFS in a Matrix

### 🧭 BFS (Breadth-First Search)
- Use a **queue** to explore nodes level by level.
- Great for finding the **shortest path** or **minimum steps**.
- You usually track visited nodes to avoid revisiting them.
- Common pattern:
  ```java
  Queue<int[]> queue = new LinkedList<>();
  boolean[][] visited = new boolean[rows][cols];
  queue.offer(new int[]{startRow, startCol});
  visited[startRow][startCol] = true;

    while (!queue.isEmpty()) {
      int[] cell = queue.poll();
      for (int[] dir : directions) {
          int newRow = cell[0] + dir[0];
          int newCol = cell[1] + dir[1];
          // check bounds and visit
      }
  } 
  ```

### 🧭 DFS (Depth-First Search)
- Uses recursion or an explicit stack to explore deeply along a path before backtracking.
- Ideal for exploring connected regions, backtracking, or flood-fill type problems.
- Often used when you need to visit every cell in a region or all possible paths.
- Common pattern:
    ```java
  // check bounds and if already visited
    if (row < 0 || col < 0 || row >= rows || col >= cols) return;
    if (visited[row][col] || grid[row][col] != TARGET) return;

    visited[row][col] = true;

    for (int[] dir : directions) {
        int newRow = row + dir[0];
        int newCol = col + dir[1];
        dfs(newRow, newCol);
    }
    ```
  
