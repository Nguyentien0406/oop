import java.util.Random;
import java.util.Scanner;

public class RandomWalkers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int n = sc.nextInt(), s = n * n, res = 0;
        int[] x = new int[n], y = new int[n];
        boolean[][] check = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            x[i] = n/2;
            y[i] = n/2;
        }
        check[n/2][n/2] = true;
        s--;
        while(s > 0) {
            res++;
            for (int i = 0; i < n; i++) {
                double a = rand.nextDouble();
                if(a <= 0.25) x[i]++;
                else if(a <= 0.50) x[i]--;
                else if(a <= 0.75) y[i]++;
                else y[i]--;
                if (x[i] < n && y[i] < n && x[i] >= 0 && y[i] >= 0 && check[x[i]][y[i]] == false) {
                    s--;
                    check[x[i]][y[i]] = true;
                }
            }
        }
        System.out.println(res);
    }
}