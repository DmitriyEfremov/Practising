package CodeRun.Season_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class ErrorStableStack {
    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        LOOP:while(true){
            String inp = scanner.next();

            switch (inp){
                case "push":
                    stack.push(scanner.nextInt());
                    System.out.println("ok");
                    break;
                case "pop":
                    if(stack.isEmpty()){
                        System.out.println("error");
                        break;
                    }
                    System.out.println(stack.peek());
                    stack.pop();
                    break;
                case "back":
                    if(stack.isEmpty()){
                        System.out.println("error");
                        break;
                    }
                    System.out.println(stack.peek());
                    break;
                case "size":
                    System.out.println(stack.size());
                    break;
                case "clear":
                    stack.clear();
                    System.out.println("ok");
                    break;
                case "exit":
                    System.out.println("bye");
                    break LOOP;
            }
        }
    }
}
