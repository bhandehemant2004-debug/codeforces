import java.util.*;

public class EBuildingAnAquarium {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testcases = sc.nextInt();

        while (testcases-- > 0) {

            int n = sc.nextInt();
            int x = sc.nextInt();

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);

            int left = 1;
            int right = arr[n - 1]+x;
            int ans = 0;

            while (left <= right) {

                int mid = left + (right - left) / 2;

                long water = solve(arr, mid);

                if (water <= x) {
                    ans = mid;
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            System.out.println(ans);
        }

        sc.close();
    }

    public static long solve(int[] arr, int h) {

        long sum = 0;

        for (int height : arr) {
            if (height < h) {
                sum += h - height;
            }
        }

        return sum;
    }
}