package Education_practice.DataStructures;

import java.util.Arrays;

public class StackBasedWithArray {
    protected int size=10;
    protected int pointer=-1;
    protected char[] data;

    public StackBasedWithArray(int size){
        this.size=size;
        data=new char[size];
    }
    public StackBasedWithArray(){
        data=new char[size];
    }

    public void put(char value){
        if(isFull()) extend();
        data[++pointer] = value;
    }
    public char pop(){
        return data[pointer--];
    }
    public char peek(){
        return data[pointer];
    }
    public boolean isEmpty() {
        return pointer == -1;
    }

    protected boolean isFull(){
        return pointer==size;
    }
    protected void extend(){
        data= Arrays.copyOf(data,size*2);
    }
    @Override
    public String toString(){
        return Arrays.toString(data);
    }
}
