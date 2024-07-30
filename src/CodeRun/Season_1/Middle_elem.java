package CodeRun.Season_1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Middle_elem {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] ar = new int[3];
        for(int i=0;i<3;i++ ){
            int a = scn.nextInt();
            ar[i]=a;
        }
        Arrays.sort(ar);
        System.out.println(ar[1]);
    }
}
