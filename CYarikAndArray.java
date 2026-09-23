import java.util.*;

public class CYarikAndArray{

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int testcases = sc.nextInt();

        while(testcases>0){

            int n = sc.nextInt();

            int first = sc.nextInt();
            int sum = first;
            int totalsum = first;
            int pre = first;
            for(int i = 1 ;i< n;i++){
                int num = sc.nextInt();
                if(checkparity(pre,num)){
                    sum = Math.max(num,sum+num);
                }
                else{
                    sum = num;
                }
                pre = num;
                totalsum = Math.max(totalsum, sum);

            }
            System.out.println(totalsum);


            testcases--;
        }
        sc.close();

    }
    public static boolean checkparity(int a , int b){
        if(a<0)a*=-1;
        if(b<0)b*=-1;
        if((a+b) %2 == 0)return false;
        else return true;
    }
}