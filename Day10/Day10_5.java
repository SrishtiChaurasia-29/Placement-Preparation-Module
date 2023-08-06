class Solution {
    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        ArrayList<String> possPath = new ArrayList<>();
        int[] nextRows = {1, 0, 0, -1};
        int[] nextCols = {0, -1, 1, 0};
        if(m[0][0] != 0)
            findPath(m, 0, 0, "", possPath, nextRows, nextCols);
        return possPath;
    }
    
    private static void findPath(int[][] m, int r, int c, String currPath, ArrayList<String> possPath, int[] nextRows, int[] nextCols) {
        // base case
        if(r == m.length-1 && c == m.length-1) {
            possPath.add(currPath);
            return;
        }
        
        // 4 choices
        String directions = "DLRU";
        for(int i = 0; i<4; i++) {
            int nextRow = r + nextRows[i];
            int nextCol = c + nextCols[i];
            if(nextRow >= 0 && nextCol >= 0 && nextRow < m.length && nextCol < m.length && m[nextRow][nextCol] != 0) {
                m[r][c] = 0;
                findPath(m, nextRow, nextCol, currPath + directions.charAt(i), possPath, nextRows, nextCols);
                m[r][c] = 1;
            }
        }
    }
}