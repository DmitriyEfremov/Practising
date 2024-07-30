package CodeRun.Season_1;

import java.util.Scanner;
import java.util.HashMap;

public class Frequent_elem {
    public static void main(String[] args) {
        HashMap<Long,Integer> nums=new HashMap<>();
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0; i<n;i++){
            long temp = s.nextLong();
            if(!nums.containsKey(temp)){
                nums.put(temp,1);
            }else{
                nums.put(temp,nums.get(temp)+1);
            }
        }

        int max=0;
        long answer=-1;
        for(long a:nums.keySet()){
            if(nums.get(a)>max || (nums.get(a)==max && a>answer)){
                answer=a;
                max=nums.get(a);
            }
        }
        System.out.println(answer);
    }
}
