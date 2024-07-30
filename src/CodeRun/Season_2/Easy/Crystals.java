package CodeRun.Season_2.Easy;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Crystals {
    static ArrayList<Character> letters = new ArrayList<>();
    static ArrayList<ArrayList<Integer>> amount = new ArrayList<>();
    static int cnt = 0;
    static int indexInArrayOfLetters = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder builder = new StringBuilder();
        Pattern pattern = Pattern.compile("\\D+");
        for(int i=0;i<3;i++) {
            String input =  reader.readLine();
            Matcher matcher=pattern.matcher(input);
            if(!matcher.matches()){
                System.out.println("IMPOSSIBLE");
                System.exit(0);
            }
            char[] first_str = input.toCharArray();
            for (char ch : first_str) {
                if (letters.isEmpty()) {
                    letters.add(ch);
                }
                if (ch != letters.get(indexInArrayOfLetters)) {
                    add(i);
                    if(i==0) {
                        letters.add(ch);
                    }
                    indexInArrayOfLetters++;
                }
                cnt++;
            }
            add(i);
            indexInArrayOfLetters=0;
            if(i==0){
                StringBuilder temp=new StringBuilder();
                for(char ch:letters){
                    temp.append(ch).append("+");
                }
                pattern=Pattern.compile(temp+"");
            }
        }

        for(int i=0;i<letters.size();i++){
            int res=-1;
            int minSum=100000;
            ArrayList<Integer> toProceed = amount.get(i);
            for(int j=toProceed.get(0);j<toProceed.get(toProceed.size()-1)+1;j++) {
                int temp = 0;
                for (int element : toProceed) {
                    temp += Math.abs(j - element);
                }
                if (minSum > temp) {
                    minSum = temp;
                    res = j;
                }
            }
            for(int iter=0;iter<res;iter++){
                builder.append(letters.get(i));
            }


        }
        System.out.println(builder);


    }



    static void add(int i){
        if(i==0) {
            amount.add(new ArrayList<>());
        }
        int index = amount.get(indexInArrayOfLetters).size();
        while(index>0 && cnt<amount.get(indexInArrayOfLetters).get(index-1)){
            index--;
        }
        amount.get(indexInArrayOfLetters).add(index,cnt);
        cnt = 0;
    }
}
