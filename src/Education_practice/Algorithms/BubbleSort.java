package Education_practice.Algorithms;

public class BubbleSort {
    //сложность O(n^2)

    public int[] variantOne(int[] inputData){
        for(int i=0;i<inputData.length;i++){
            for(int j=0;j<inputData.length-i-1;j++){
                if(inputData[j]>inputData[j+1]){
                    int buffer=inputData[j];
                    inputData[j]=inputData[j+1];
                    inputData[j+1]=buffer;
                }
            }
        }
        return inputData;
    }

    static int[] variantTwo(int[] inp){
        int temp=0;
        for(int i=inp.length;i>0;i--){
            for(int j=0;j<i-1;j++){
                if(inp[j]>inp[j+1]){
                    temp=inp[j];
                    inp[j]=inp[j+1];
                    inp[j+1]=temp;
                }
            }
        }
        return inp;
    }



}
