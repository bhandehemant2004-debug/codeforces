import java.util.Scanner;
public class B250ThousandTonsOfTnt{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testcases = sc.nextInt();

        while(testcases>0){
            int n  = sc.nextInt();
            long prefixsum[] = new long[n];

            long sum = 0 ;
            long Min_Value = Long.MAX_VALUE;
            long Max_Value = Long.MIN_VALUE;
            for(int i = 0 ;i< n;i++){
                int num = sc.nextInt();
                sum += (long)num;
                prefixsum[i]=sum;
                if( Min_Value > num ) Min_Value = num;
                if( Max_Value < num) Max_Value = num;
            }
            long Max_differ = Max_Value-Min_Value;
            for(int i = 2 ;i<= n/2 ;i++){
                if(n % i == 0){
                    Min_Value = Long.MAX_VALUE;
                    Max_Value = Long.MIN_VALUE;
                    long previous = 0;
                    for(int index = i ; index<=n;index+=i ){
                        long cal = prefixsum[index-1]-previous;
                        if(cal>Max_Value)Max_Value=cal;
                        if(cal<Min_Value)Min_Value= cal;
                        previous = prefixsum[index-1];
                    }
                    Max_differ=Math.max(Max_differ, Max_Value-Min_Value);
                }
            }
            System.out.println(Max_differ);
            testcases--;
    }
}
}