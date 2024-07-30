package CodeRun.Season_1;

import java.io.*;
import java.util.Arrays;

public class Merge_median {
    public static void main(String[] args) {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String[][] data={};
        int amount=0,len=0;
        try{
            String[] inp= r.readLine().split(" ");
            amount = Integer.parseUnsignedInt(inp[0]);
            len= Integer.parseUnsignedInt(inp[1]);
            data = new String[amount][len];
            for(int i=0;i<amount;i++){
                data[i]=r.readLine().split(" ");
            }
        }
        catch(IOException e){

        }
        for(int i=0;i<amount-1;i++){
            for(int j=i+1;j<amount;j++){
                int[] res=new int[len*2];

                int first=0,second=0;
                String[] comp1 = data[i];
                String[] comp2 = data[j];

                while(first<len&&second<len){
                    int n1=Integer.parseInt(comp1[first]);
                    int n2 = Integer.parseInt(comp2[second]);
                    if(n1<=n2) {
                        res[first+second]=n1;
                        first++;
                    }
                    else{
                        res[first+second]=n2;
                        second++;
                    }
                }
                if(first==len){
                    for(;second<len; second++){
                        res[first+second]=Integer.parseInt(comp2[second]);
                    }
                }else{
                    for(;first<len; first++){
                        res[first+second]=Integer.parseInt(comp1[first]);
                    }
                }
                System.out.println(res[len-1]);
            }
        }
    }
}
