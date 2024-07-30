package Education_practice.Algorithms;

import Education_practice.DataStructures.StackBasedWithArray;

import java.util.HashMap;

public class RPN {
    String toCheck="-+*/^(";
    HashMap<Character,Integer> values = new HashMap<>();
    private StackBasedWithArray stack;
    private String input;
    public RPN(String str) {
        values.put('+',1);
        values.put('-',1);
        values.put('*',2);
        values.put('/',2);
        values.put('^',3);
        values.put('(',4);
        input = str;
        stack=new StackBasedWithArray(str.length());
    }
    public String proceed(){
        StringBuilder builder = new StringBuilder();
        for(char symbol: input.toCharArray()){
            System.out.println(stack.toString());
            if(symbol==')'){
                while(!stack.isEmpty() && stack.peek()!='('){
                    builder.append(stack.pop());
                }
                stack.pop();
            }
            else if(!toCheck.contains(symbol+"")){
                builder.append(symbol);
            }
            else {
               while(!stack.isEmpty() && (values.get(stack.peek())>values.get(symbol) && stack.peek()!='(')){
                   builder.append(stack.pop());
               }
               stack.put(symbol);

            }
        }
        while(!stack.isEmpty()){
            builder.append(stack.pop());
        }
        return builder+"";
    }

}
