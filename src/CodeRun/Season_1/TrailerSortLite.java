package CodeRun.Season_1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class TrailerSortLite {
    public static void main(String[] args) {
        Stack<Integer> dead_end = new Stack<>();
        Scanner scn = new Scanner(System.in);
        ArrayList<Integer> res = new ArrayList<>();
        int len = scn.nextInt();
        for(int i=0;i<len;i++){
            int tmp = scn.nextInt();
            if(dead_end.isEmpty()){
                dead_end.push(tmp);
            }else{
                if(tmp<dead_end.peek()){
                    dead_end.push(tmp);
                }
                else{
                    while(!dead_end.isEmpty()&&dead_end.peek()<tmp){
                        res.add(dead_end.pop());
                    }
                    dead_end.push(tmp);
                }
            }
        }
        while(!dead_end.isEmpty()){
            res.add(dead_end.pop());
        }
        for(int i=0;i<res.size()-1;i++){
            if(res.get(i)>res.get(i+1)){
                System.out.println("NO");
                System.exit(0);
            }
        }
        System.out.println("YES");
    }

}
