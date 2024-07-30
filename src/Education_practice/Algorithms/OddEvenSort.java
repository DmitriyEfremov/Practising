package Education_practice.Algorithms;


import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class OddEvenSort {

    public int[] sort(int[] inputData){
        int outerCnt=0;
        while(true){
            int cnt=0;
            for(int i=0; i<inputData.length-1;i+=2){
                if(inputData[i]>inputData[i+1]){
                    int buffer=inputData[i];
                    inputData[i]=inputData[i+1];
                    inputData[i+1]=buffer;
                    cnt++;
                }
                System.out.println(Arrays.toString(inputData));
            }
            System.out.println("-----------------");
            for(int i=1; i<inputData.length-1;i+=2){
                if(inputData[i]>inputData[i+1]){
                    int buffer=inputData[i];
                    inputData[i]=inputData[i+1];
                    inputData[i+1]=buffer;
                    cnt++;
                }
                System.out.println(Arrays.toString(inputData));
            }
            if(cnt==0){
             break;
            }
            outerCnt++;

        }
        System.out.println("Количество итераций: "+outerCnt);
        return inputData;
    }
}
