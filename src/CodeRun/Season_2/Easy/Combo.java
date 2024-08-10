package CodeRun.Season_2.Easy;

import java.io.*;
import java.util.HashMap;
import java.util.HashSet;

public class Combo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int resultSum = 0;
        int sumOfCombos=0;
        int comboItemsPrice = 0;

        HashMap<Integer,Integer> items = new HashMap<>();
        HashSet<Integer> comboItems = new HashSet<>();
        HashMap<Integer,Integer> amountOfEachItem = new HashMap<>();

        int amount = Integer.parseInt(reader.readLine());
        String[] input = reader.readLine().split(" ");
        for(int i=0;i<amount;i++){
            items.put(i+1,Integer.parseInt(input[i]));
        }
        int comboPrice = Integer.parseInt(reader.readLine());
        input=reader.readLine().split(" ");
        for(String s: input){
            comboItems.add(Integer.parseInt(s));
            comboItemsPrice+=items.get(Integer.parseInt(s));
        }
        reader.readLine();
        input=reader.readLine().split(" ");
        for(String elem: input){
            int s = Integer.parseInt(elem);
            if(!comboItems.contains(s)){
                resultSum+=items.get(s);
            }
            else{
                if(amountOfEachItem.containsKey(s)){
                    amountOfEachItem.put(s,amountOfEachItem.get(s)+1);
                }else{
                    amountOfEachItem.put(s,1);
                }
                sumOfCombos+=items.get(s);
            }
        }
        if(comboPrice<comboItemsPrice){
            sumOfCombos=0;
            while(true){
                comboItemsPrice=0;
                for(int element: comboItems){
                    if(amountOfEachItem.containsKey(element) && amountOfEachItem.get(element)!=0){
                        comboItemsPrice+=items.get(element);
                        amountOfEachItem.put(element,amountOfEachItem.get(element)-1);
                    }
                }
                if (comboItemsPrice==0) break;
                sumOfCombos+=Math.min(comboPrice,comboItemsPrice);
            }
        }
        System.out.println(resultSum+sumOfCombos);

        reader.close();
    }
}