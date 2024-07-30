package Contest;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        int sum=0;
        Scanner scn = new Scanner(System.in);
        String[] table = new String[8];
        for(int i=0;i<8;i++){
            table[i]=scn.next();
        }
        for(int i = 0; i<8;i++){
            String s = table[i];
            for(int j=1; j<7;j++){
                String a = s.substring(j-1,j+2);
                String vert = (table[j-1].charAt(i)+"")+table[j].charAt(i)+table[j+1].charAt(i);
                if(i<7){
                    if (a.equals("...")&&table[i+1].charAt(j)=='.'){
                        sum++;
                    }
                    if(vert.equals("...") && table[j].charAt(i+1)=='.'){
                        sum++;
                    }
                }
                if(i>0){
                    if (a.equals("...")&&table[i-1].charAt(j)=='.' ){
                        sum++;
                    }
                    if(vert.equals("...") && table[j].charAt(i-1)=='.'){
                        sum++;
                    }
                }

            }
        }
        System.out.println(sum);

    }
}
