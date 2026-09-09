import java.util.Scanner;

public class CQuests{


    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int testcases = sc.nextInt();


        while(testcases>0){
            int n = sc.nextInt();
            int k  = sc.nextInt();

            int []a = new int[n];
            int []b = new int[n];

            for(int i = 0 ;i< n;i++ )a[i]=sc.nextInt();
            for(int i = 0 ;i< n ;i++)b[i]=sc.nextInt();

            int current_sum = 0;
            int total_sum = 0;
            int current_strong = 0;
            for(int i = 0;i<Math.min(n,k);i++){
                current_sum += a[i];
                current_strong = Math.max(current_strong, b[i]);
                total_sum = Math.max(total_sum,current_sum+(k-i-1)*current_strong);
                
            }
           
            System.out.println(total_sum);
            testcases--;

        }
    }
}