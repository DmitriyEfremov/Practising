package CodeRun.Season_2.Easy;

import java.io.*;

public class MostAmountOfDividers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int inputNumber=Integer.parseInt(reader.readLine());
        if(inputNumber==1) {
            System.out.println(1 + "\n" + 1);
        }

        else{
            int res=0,resCounter=0;
            outer:for(int num=2;num<=inputNumber;num++) {
                int tempCnt=2;
                int correction=1;
                int starter=2;
                if (num%2!=0){
                    starter=3;
                    correction=2;

                }
                for (int i = starter; i < Math.sqrt(num) + 0.5; i+=correction) {
                    if (num % i == 0) {
                        tempCnt++;
                        if(i!=num/i){
                            tempCnt++;
                        }
                    }
                    if(i==8 && tempCnt<5){
                        continue outer;
                    }
                }
                if(tempCnt>resCounter || tempCnt==resCounter && num>res){
                    res=num;
                    resCounter=tempCnt;
                }
            }
            System.out.println(res+"\n"+resCounter);
        }
        reader.close();
    }
}
