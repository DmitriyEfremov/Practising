package CodeRun.Season_2.Easy;

import java.io.*;
import java.util.Arrays;

public class MostAmountOfQueens {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        byte sum=0;
        int cnt=0;
        String[] inp = reader.readLine().split(" ");
        Arrays.sort(inp);
        int iter=0;
        for(String elem: inp){
            sum+=Byte.parseByte(elem);
            if(sum>4){
                iter++;
            }
        }if(sum>=2) System.out.println(iter);
        else{
            System.out.println(1);
        }

        reader.close();
    }
}
