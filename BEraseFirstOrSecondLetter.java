import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BEraseFirstOrSecondLetter{


    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);


        int tests = sc.nextInt();


        while(tests > 0){
            int n = sc.nextInt();
            String str = sc.next();
            Set<String>set = new HashSet<>();
            
            System.out.println(solve(n,str,set));
            tests--;
        }
        
        sc.close();
    }
    public static int solve(int length , String str , Set<String>set){

        int ans = 0;

        int arr[] = new int[26];
        Arrays.fill(arr,-1);
        
        for(int i = 0 ;i< length;i++){
            int a = str.charAt(i)-'a';
            if(arr[a]==-1){
                arr[a]=1;
                ans += length-i;
            }
        }
        return ans;


    }
}