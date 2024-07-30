package CodeRun.Season_2.Easy;

import java.io.*;

public class Tiles {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inp = reader.readLine().split(" ");
        int black = Integer.parseInt(inp[0]);
        int white = Integer.parseInt(inp[1]);

        for(int i=1;i<=white/2+1;i++){
            if(white%i==0 && (white/i+i)*2+4==black){
                System.out.println((Math.max(white/i,i)+2)+" "+ (Math.min(white/i,i)+2));
                break;
            }

        }

        reader.close();
        writer.close();
    }
}
