package Education_practice.DataStructures;

import java.util.Arrays;

public class BasicArray {
    private int[] data;
    int capacity;
    int size=0;
//Конструктор, создающий пустой массив длины capacity
    public BasicArray(int capacity){
        data=new int[capacity];
        this.capacity=capacity;

    }
    //конструктор, создающий массив, включающий в себя элементы ... a, длина массива: количество элементов + 10
    public BasicArray(int ... a){
        capacity=a.length+10;
        data=new int[capacity];
        System.arraycopy(a,0,data,0,a.length);
        size=a.length;
        System.out.println(Arrays.toString(data));
    }
    public void append(int value){
        if(isFull()){
            System.out.println("array is full");
        }else{
            data[size++]=value;
        }
    }
    public void remove(int index){
        if(!isEmpty()&& index>-1 &&index<size){
            for(int i =index;i<size-1;i++){
                data[i]=data[i+1];
            }
            size--;
        }
    }
    private boolean isFull(){
        return capacity==size;
    }

    public boolean isEmpty(){
        return size==0;
    }

    @Override
    public String toString(){
        String out="";
        for(int i=0;i<size;i++){
            out=out.concat(data[i]+"").concat(" ");
        }
        return out+"";
    }


}
