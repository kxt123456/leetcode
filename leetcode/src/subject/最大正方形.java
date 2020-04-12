package subject;

public class 最大正方形 {
    public int maximalSquare(char[][] matrix) {
        if (matrix == null || matrix.length < 1 || matrix[0].length < 1) return 0;
        int height = matrix.length;
        int width = matrix[0].length;
        int[][] dp = new int[height + 1][width + 1];
        int maxSize=0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j]=='1') {
                    dp[i+1][j+1] = Math.min(dp[i ][j ], Math.min(dp[i +1][j], dp[i ][j +1]))+1;
                    maxSize=Math.max(dp[i+1][j+1],maxSize);
                }
            }
        }
        return maxSize*maxSize;
    }
}
