package CodeRun.Season_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Error {
    public static void main(String[] args) {
        double sum=0;
        double[] probability={};
        double[] error_prob = {};

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        try {
            int len = Integer.parseInt(r.readLine());
            probability=new double[len];
            error_prob = new double[len];
            for(int i=0;i<len;i++){
                String[] data = r.readLine().split(" ");
                probability[i]=(double)Integer.parseInt(data[0])/100;
                error_prob[i]=(double)Integer.parseInt(data[1])/100;
                sum+=probability[i]*error_prob[i];
            }

            for(int i=0;i<len;i++){
                System.out.println((probability[i]*error_prob[i])/sum);
            }

        }catch(IOException e){

        }
    }
}
