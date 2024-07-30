package Contest;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        int res=0;
        Scanner scn = new Scanner(System.in);
        int len = scn.nextInt();
        int time = scn.nextInt();
        int s = scn.nextInt();
        int first = scn.nextInt();
        int basic = first*time/s;
        int two = 2*time/s;
        for(int i=0;i<len-1;i++){
            int tmp = scn.nextInt();
            if (tmp>first){continue;}
            if(first*time%s == tmp*time%s){
                res--;
            }

            res+=basic-tmp/2*two;

        }
        System.out.println(res);
    }
}
