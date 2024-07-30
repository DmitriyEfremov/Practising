package CodeRun.Season_2.Middle;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class ChallengeOne_EulerFunction {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(reader.readLine());
        double res=1;
        for(int i=2;i< num+1;i++){
            if (num%i==0){
                int cnt=0;
                while(num%i==0){
                    cnt++;
                    num/=i;
                }
                res=res*(Math.pow(i,cnt)-Math.pow(i,cnt-1));
            }
        }
        System.out.println((int)res);
        reader.close();
        writer.close();
    }
}
