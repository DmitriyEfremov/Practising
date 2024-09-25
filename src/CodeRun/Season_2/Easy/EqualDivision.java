package CodeRun.Season_2.Easy;

import java.io.*;
import java.util.Comparator;
import java.util.HashMap;

public class EqualDivision {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Character, Integer> countingSymbols = new HashMap<>();



        String input = reader.readLine();
        for(char ch:input.toCharArray()){
            if(countingSymbols.containsKey(ch)){
                countingSymbols.put(ch, countingSymbols.get(ch)+1);
            }else{
                countingSymbols.put(ch,1);
            }
        }
        for(char ch:countingSymbols.keySet()){

        }


        reader.close();
    }
    private static void countAndJudge(String s){


    }
}

