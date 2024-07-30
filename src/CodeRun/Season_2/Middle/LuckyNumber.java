package CodeRun.Season_2.Middle;

import java.io.*;

public class LuckyNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String number = reader.readLine();
        StringBuilder firstHalf = new StringBuilder(number.substring(0, number.length()/2));
        StringBuilder secondHalf = new StringBuilder(number.substring(number.length()/2));
        int firstSum=0, secondSum=0;

        for(char ch: firstHalf.toString().toCharArray()){

        }
        reader.close();
        writer.close();
    }

}
