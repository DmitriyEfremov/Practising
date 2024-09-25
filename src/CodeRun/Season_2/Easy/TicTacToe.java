package CodeRun.Season_2.Easy;

import java.io.*;
import java.util.Arrays;


public class TicTacToe {
    static String[][] map;
    static String[] inp;
    static int len;
    static int width;
    static int iter=0;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        boolean XWin=false, OWin=false;

        inp = reader.readLine().split(" ");
        len=Integer.parseInt(inp[0]);
        width=Integer.parseInt(inp[1]);

        map = new String[len][width];
        for(int i=0;i<len;i++){
            String iterativeInput=reader.readLine();
            for(int j=0;j<width;j++){
                map[i][j]=iterativeInput.charAt(j)+"";
            }
        }
        outer:for(int i=0;i<len;i++){
            for(int j=0;j<width;j++){
                if (!map[i][j].equals(".")){
                    iter=0;
                    if (horizontal(map[i][j],i,j) ||  vertical(map[i][j],i,j)||diagonal(map[i][j],i,j )|| ReverseDiagonal(map[i][j],i,j)){
                        if(map[i][j].equals("X")){
                            XWin=true;
                        }else{
                            OWin=true;
                        }
                    }
                }
            }
        }
        if(OWin^XWin){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        reader.close();
    }
    static boolean horizontal(String symbol,int i,int j){
        while (len>i){
            if(map[i][j].equals(symbol))
            iter++;
            i++;
        }
        return iter >= 5;

    }  static boolean vertical(String symbol,int i,int j){

        if (iter==5){
            return true;
        }
        else if (width>j && map[i][j].equals(symbol)){
            iter++;
            return vertical(symbol,i,j+1);
        }
        else{
            iter=0;
            return false;
        }
    }  static boolean diagonal(String symbol,int i,int j) {

        if (iter == 5) {
            return true;
        } else if (len > i && width > j && map[i][j].equals(symbol)) {
            iter++;
            return diagonal(symbol, i + 1, j + 1);
        } else {
            iter=0;
            return false;
        }
    }
    static boolean ReverseDiagonal(String symbol,int i,int j) {

        if (iter == 5) {
            return true;
        } else if (-1 < i && -1 < j && map[i][j].equals(symbol)) {
            iter++;
            return ReverseDiagonal(symbol, i - 1, j - 1);
        } else {
            iter=0;
            return false;
        }
    }
}