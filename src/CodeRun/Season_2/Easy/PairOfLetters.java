package CodeRun.Season_2.Easy;

import java.io.*;
import java.util.HashMap;

public class PairOfLetters {
    //Скорее всего можно сделать эффективнее
    private static HashMap<String, Integer> frequency = new HashMap();
    private static StringBuilder builder;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = reader.readLine().split(" ");
        for(String word:input) {
            word = word.trim();
            if (word.length() >= 2) {
                builder = new StringBuilder();
                for (int i = 0; i < word.length(); i++) {
                    if (builder.length() < 2) {
                        builder.append(word.charAt(i));
                    } else {
                        add(word.charAt(i));
                    }
                }
                add('0');
            }
        }

        int val=-1;
        String res="";
        for(String key: frequency.keySet()){
            int comp=frequency.get(key);
            if(comp>val ||frequency.get(key)==val && key.compareTo(res)>0){
                res=key;
                val=comp;
            }
        }
        System.out.println(res);
    }
    // метод для добавления элемента в словарь frequency и дальнейшая обработка буфера builder
    static void add(char ch){
        if(!frequency.containsKey(builder.toString())){
            frequency.put(builder+"",1);
        }else{
            frequency.put(builder+"", frequency.get(builder+"")+1);
        }
        builder.deleteCharAt(0).append(ch);
    }

}
