package Education_practice.Algorithms;

import Education_practice.DataStructures.StackBasedWithArray;

import java.util.Arrays;
import java.util.HashMap;

public class PairsOfBrackets {
    private StackBasedWithArray stack;
    HashMap<Character,Character> letters = new HashMap<>();
    public PairsOfBrackets(){
        stack=new StackBasedWithArray();
        letters.put('[',']');
        letters.put('(',')');
        letters.put('{','}');
    }

    public boolean isValid(String input){

        char[] toCheck = input.toCharArray();
        for(char symbol:toCheck){
            if(letters.containsKey(symbol)){
                stack.put(symbol);
            }
            else if(letters.containsValue(symbol)){
                if(stack.isEmpty()){
                    System.out.println("Лишние закрывающие скобки: "+symbol);
                }
                else if(symbol!=letters.get(stack.peek())){
                    System.out.println("Несовпадение скобок: "+symbol);
                    return false;
                }
                stack.pop();
            }

        }
        if(stack.isEmpty()){
            return true;
        }else{
            System.out.println("Незакрытые скобки: "+stack.toString());
            return false;
        }
    }
}
