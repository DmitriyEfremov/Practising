package CodeRun.Season_1;

import java.util.Arrays;
import java.util.Scanner;

public class Check_s {
    static StringBuilder inp;
    private static int pos=0;
    private static int len=0;
    public static void main(String[] args) {
        Scanner scn=  new Scanner(System.in);
        StringBuilder toCheck = new StringBuilder(scn.next());
        String[] process = scn.next().replace(">","<").replace("<<","<").split("<");
        inp = new StringBuilder(process[0]);
        pos=process[0].length();
        len=pos;
        for(int i=1;i<process.length;i++){
            switch (process[i]){
                case "delete":
                    delete();
                    break;
                case "bspace":
                    bspace();
                    break;
                case "left":
                    left();
                    break;
                case "right":
                    right();
                    break;
                default:
                    inp.insert(pos, process[i]);
                    len+=process[i].length();
                    pos+=process[i].length();
            }
        }
        if(toCheck.compareTo(inp) == 0) System.out.println("Yes");
        else System.out.println("No");
    }

    private static void bspace(){
        if (pos>1) {
            inp.deleteCharAt(pos - 1);
            len--;
            pos--;
        }
    }
    private static void delete() {
        if (pos < len) {
            inp.deleteCharAt(pos);
            len--;
        }
    }
    private static void left(){
        if (pos>1) pos--;
    }
    private static void right(){
        if(pos<len-1) pos++;
    }
}
