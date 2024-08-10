package CodeRun.Season_2.Easy;

import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class MostAmountOfQueens {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        byte sum=0;
        int cnt=0;
        String[] inp = reader.readLine().split(" ");
        Arrays.sort(inp);
        System.out.println(Arrays.toString(inp));
        for(String elem: inp){
            sum+=Byte.parseByte(elem);
        }
        if(sum >= 2 && sum <= 4){
            System.out.println(0);
        }else{
         //   for(String  )
        }

        reader.close();
        writer.close();
    }
}
