package CodeRun.Season_2.Middle;

import java.io.*;

public class TheBiggestSquare {
    static String[][] field;
    static int currentLength;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sizes = reader.readLine().split(" ");
        int length = Integer.parseInt(sizes[0]);
        int width = Integer.parseInt(sizes[1]);
        int maxLenOfSquare = Math.min(length,width);
        field = new String[length][];
        int resultingLength = -1;
        int xRes=-1;
        int yRes=-1;
        currentLength = 0;

        for(int i=0;i<length;i++) {
            field[i]= reader.readLine().split(" ");
        }
        for(int i=0;i<length;i++){
            for(int j=0;j<width;j++){
                if(field[i][j].equals("1")){
                    currentLength=1;

                }
            }
        }

        reader.close();
        writer.close();
    }


}
