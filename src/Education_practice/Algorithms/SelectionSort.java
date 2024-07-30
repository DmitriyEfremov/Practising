package Education_practice.Algorithms;

public class SelectionSort {
    //Количество перестановок O(n)
    //Количество сравнений O(n^2)
    //Общая сложность O(n^2)
    public int[] sort(int[] inputData){
        for(int i=0;i<inputData.length-1;i++){
            int index=i;
            for(int j=i;j<inputData.length;j++){
                if(inputData[index]>inputData[j]){
                    index=j;
                }
            }
            int bubble=inputData[index];
            inputData[index]=inputData[i];
            inputData[i]=bubble;
        }
        return inputData;
    }
}
