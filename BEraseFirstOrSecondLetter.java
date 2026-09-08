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
            solve(str,set);
            System.out.println(set.size());
            tests--;
        }
        
        sc.close();
    }
    public static void solve(String str , Set<String>set){
        if(str.isEmpty())return;
        int length = str.length();
        set.add(str);
        if(length>=2){
            solve(str.charAt(0)+str.substring(2), set);
            solve(str.charAt(1)+str.substring(2), set);
        }    
    }
}07A8-8440
