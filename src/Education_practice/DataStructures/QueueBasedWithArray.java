package Education_practice.DataStructures;

import java.util.Arrays;
//Очередь с циклическим переносом
public class QueueBasedWithArray {
    protected int startPivot=0;
    protected int endPivot=-1;
    protected int capacity;
    protected int[] data;
    public QueueBasedWithArray(){
        data=new int[10];
    }

    public QueueBasedWithArray(int len){
        data=new int[len+1];
        capacity = len;
    }
    public QueueBasedWithArray(int ... inputData){
        capacity=inputData.length*2;
        data=new int[capacity+1];
        for(int i=0;i<inputData.length;i++){
            data[i]=inputData[i];
        }
        endPivot=inputData.length-1;
    }
    public void push(int value){
        if(endPivot==capacity-1){
                endPivot=-1;
        }
        data[++endPivot]=value;

    }
    public int peek(){
        return data[startPivot];
    }
    public int remove(){
        if(!isEmpty()) {
            if(startPivot==capacity) {
                startPivot=0;
            }
            return data[startPivot++];
        }else{
            System.out.println("Очередь пуста");
            return -1;
        }
    }
    public boolean isEmpty(){
        return startPivot==endPivot+1 || startPivot+capacity-1==endPivot;
    }

    @Override
    public String toString(){
        return Arrays.toString(data);
    }

}
