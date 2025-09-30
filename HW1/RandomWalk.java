import edu.princeton.cs.algs4.*;
public class RandomWalk {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        StdDraw.setScale(-n - 0.5, n + 0.5);
        StdDraw.clear(StdDraw.GRAY);
        StdDraw.enableDoubleBuffering();
        int x = 0, y = 0;
        int steps = 1;
        int[][] dir = {{1,0},{0,-1},{-1,0},{0,1}};
        int d = 0;
        int total = 1;
        boolean end = false;
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.filledSquare(x, y, 0.45);
        StdDraw.show();
        StdDraw.pause(300);
        while (total < (2 * n + 1) * (2 * n + 1)) {
            for (int k = 0; k < 2; k++) {
                for (int i = 0; i < steps; i++) {
                    if (i == 2 * n) {
                        end = true;
                        break;
                    }
                    StdDraw.setPenColor(StdDraw.BLUE);
                    StdDraw.filledSquare(x, y, 0.45);
                    x += dir[d][0];
                    y += dir[d][1];
                    total++;
                    StdDraw.setPenColor(StdDraw.WHITE);
                    StdDraw.filledSquare(x, y, 0.45);
                    StdDraw.show();
                    StdDraw.pause(200);
                }
                if (end) {
                    break;
                }
                d = (d + 1) % 4;
            }
            steps++;
        }
        StdOut.println("Total steps = " + total);
    }
}