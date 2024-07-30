package CodeRun.Season_1;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Conveyor {


    public static void main(String[] args) throws IOException {
        Stack<Double> stack = new Stack<>();
        int a=1;
        Scanner scn = new Scanner(System.in);

        int tests = scn.nextInt();

        OUTTER:for(int i=0;i<tests;i++){
            int len=scn.nextInt();
            double first = Double.parseDouble(scn.next());
            System.out.println(first);
            ArrayList<Double> res=new ArrayList<>();
            stack.push(first);
            for (int it=2;it < len-1;it++){
                double tmp = scn.nextDouble();
                if(!stack.isEmpty()){
                    if(tmp>=stack.peek()){
                        while(!stack.isEmpty()&&tmp>=stack.peek()){
                            res.add(stack.pop());
                        }
                        stack.push(tmp);
                    }else{
                        res.add(tmp);
                    }
                }else{
                    stack.push(tmp);
                }
            }
            while(!stack.empty()){
                res.add(stack.pop());
            }
            for(int i1=1;i1<res.size();i1++){
                if(res.get(i1-1)>res.get(i1)){
                    System.out.println(0);
                    continue OUTTER;
                }
            }
            System.out.println(1);

        }
    }
}
