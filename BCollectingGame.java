import java.util.Arrays;
import java.util.Scanner;

public class BCollectingGame {

    static class Pair {
        long value;
        int index;

        Pair(long value, int index) {
            this.value = value;
            this.index = index;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int testcases = sc.nextInt();

        while (testcases-- > 0) {

            int n = sc.nextInt();

            Pair[] arr = new Pair[n];

            for (int i = 0; i < n; i++) {
                arr[i] = new Pair(sc.nextLong(), i);
            }

            Arrays.sort(arr, (a, b) -> Long.compare(a.value, b.value));

            long[] prefix = new long[n];

            prefix[0] = arr[0].value;

            for (int i = 1; i < n; i++) {
                prefix[i] = prefix[i - 1] + arr[i].value;
            }

            int[] ans = new int[n];

            ans[n - 1] = n - 1;

            for (int i = n - 2; i >= 0; i--) {

                if (prefix[i] >= arr[i + 1].value) {
                    ans[i] = ans[i + 1];
                } else {
                    ans[i] = i;
                }
            }

            int[] originalAns = new int[n];

            for (int i = 0; i < n; i++) {
                originalAns[arr[i].index] = ans[i];
            }

            for (int i = 0; i < n; i++) {
                System.out.print(originalAns[i] + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}