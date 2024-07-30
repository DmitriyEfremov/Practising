package Education_practice.Algorithms;

import java.util.ArrayList;
import java. util.Arrays;

//Сложность О(n^2)
    //Рабочий код сортировки merge


public class MergeSort {

    public int[] merge(int[] inp_data) {
        ArrayList<Integer> result = new ArrayList<>();
        if (inp_data.length == 1) return inp_data;
        else if (inp_data.length == 2) {
            Arrays.sort(inp_data);
            return inp_data;
        } else {
            int division_point=inp_data.length/2;
            int[] arr1 = merge(Arrays.copyOfRange(inp_data,0,division_point));
            int[] arr2 = merge(Arrays.copyOfRange(inp_data, division_point,inp_data.length));
            int i = 0, j = 0;
            while (i!=arr1.length && j!=arr2.length){
                if (arr1[i] <= arr2[j]){
                    result.add(arr1[i]);
                    i++;
                }else{
                    result.add(arr2[j]);
                    j++;
                }
            }
            if(i==arr1.length){
                for(int it = j; it < arr2.length; it++){
                    result.add(arr2[it]);
                }
            }
            else{
                for(int it = i; it < arr1.length; it++){
                    result.add(arr1[it]);
                }
            }
            int[] out = new int[result.size()];
            for(int a = 0;a < result.size();a++){
                out[a] = result.get(a);
            }
            return out;

        }
    }
}
