package Education_practice.Algorithms;

import java.util.Arrays;

public class ShellSort {
    private int[] data;
    private int dataLen;
    public ShellSort(int ... data){
        dataLen=data.length;
        this.data  = Arrays.copyOf(data,dataLen);

        System.out.println("-----------------\n"+Arrays.toString(this.data)+"\n-----------------");
    }

    public int[] sort(){
        int pivot=1;
        int inner, outer;
        while(pivot<=dataLen/3){
            pivot=pivot*3+1;
        }

        while(pivot>0) {
            for (outer = pivot; outer < dataLen; outer++) {
                int temp = data[outer];
                inner = outer;
                while (inner >= pivot && data[inner - pivot] > temp) {
                    data[inner] = data[inner - pivot];
                    inner -= pivot;
                }
                data[inner] = temp;
            }
            pivot = (pivot - 1) / 3;
        }
        return data;
    }
}
