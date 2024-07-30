package CodeRun.Season_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Stack;

public class BracketsSequence {
    public static void main(String[] args) throws IOException {
        Stack<Character> brackets = new Stack<>();
        HashMap<Character,Character> ch = new HashMap<>();
        ch.put('(',')');
        ch.put('{','}');
        ch.put('[',']');
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String toProceed = br.readLine();
        for(char a:toProceed.toCharArray()){
            if(ch.keySet().contains(a)){
                brackets.push(a);
            }
            else{
                if(!brackets.isEmpty() &&ch.get(brackets.peek())==a){
                    brackets.pop();
                }else{ System.out.println("no");
                System.exit(0);}
            }
        }
        if(brackets.isEmpty()) System.out.println("yes");
        else System.out.println("no");
    }
}
