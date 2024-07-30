package CodeRun.Season_2.Easy;

import java.io.*;


public class TicTacToe {
    static String[][] map;
    static String inp[];
    static int len;
    static int width;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        inp = reader.readLine().split(" ");
        len=Integer.parseInt(inp[0]);
        width=Integer.parseInt(inp[1]);
        map = new String[len][width];
        for(int i=0;i<width;i++){
            map[i]=reader.readLine().split(" ");
        }
        for(int i=0;i<=width;i++){
            for(int j=0;j<len;j++){
                if (!map[i][j].equals(".")){

                }
            }
        }

        reader.close();
        writer.close();
    }
    static boolean vertical(int i,int j){

        if (i+5>=len){
            return false;
        }
        for(;j<j+5;j++){

        }
        return true;
    }
    static boolean diagonal(int i, int j){return false;}
    static boolean horizontal(int i, int j){return false;}
}
