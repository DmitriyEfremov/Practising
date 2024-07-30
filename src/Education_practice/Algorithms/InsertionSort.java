package Education_practice.Algorithms;

import java.util.Arrays;

public class InsertionSort {


    //Сложность O(n^2) - средняя и худшая
    //Лучшая сложность - O (n)
    public int[] sort(int[] inputData){
        for(int i=1;i<inputData.length;i++){
            int value=inputData[i];
            int innerIndex=i;
            while(innerIndex>0 && value<=inputData[innerIndex-1]){

                inputData[innerIndex]=inputData[innerIndex-1];
                innerIndex--;
            }
            inputData[innerIndex]=value;
            System.out.println(Arrays.toString(inputData));
        }
        return inputData;
    }
    public int[] sort_no_duplicates(int[] inputData){
        int dupCounter=0;
        for(int i=1;i<inputData.length;i++){
            int value=inputData[i];
            int innerIndex=i;
            while(innerIndex>0 && value<=inputData[innerIndex-1]){
                if(value==inputData[innerIndex-1] &&value!=-1){
                    value=-1;
                    dupCounter++;
                }
                inputData[innerIndex]=inputData[innerIndex-1];
                innerIndex--;
            }
            inputData[innerIndex]=value;
            System.out.println(Arrays.toString(inputData));
        }
        return Arrays.copyOfRange(inputData,dupCounter,inputData.length);
    }



}
