package CodeRun.Season_1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class RPN {
    static Stack<Integer> nums = new Stack<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] inp = reader.readLine().split(" ");
        for(String tmp: inp){
            if(tmp.equals("+")||tmp.equals("*")||tmp.equals("-")){
                nums.push(proceed(tmp,nums.pop(),nums.pop()));
            }else{
                nums.push(Integer.parseInt(tmp));
            }
        }

        System.out.println(nums.pop());
    }
    static int proceed(String op,int a,int b){
        switch(op){
            case "+":
                return a+b;
            case "-":
                return b-a;
            case "*":
                return a*b;
            default:
                return 0;
        }
    }

}
