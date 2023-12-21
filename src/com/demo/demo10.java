import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class demo10 {
    static int[][] arr;

    public static void main(String[] args) {
        // 处理输入
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
        dfs(0, 0, 0, 0, 0);
        System.out.println(max);
        scan.close();

    }

    static int max = 0;

    // 走的方向 为 向下（向左） 向右下 （向右）
    public static void dfs(int xPos, int yPos, int left, int right, int sum) {
        int n = arr.length;
        if (xPos == n - 1) {
            if (Math.abs(left - right) <= 1) {
                max = Math.max(max, sum+arr[xPos][yPos]);
            }
            return;
        }
        sum += arr[xPos][yPos];
        // 向左走
        dfs(xPos + 1, yPos, left + 1, right, sum);
        // 向右走
        dfs(xPos + 1, yPos + 1, left, right + 1, sum);
    }
}