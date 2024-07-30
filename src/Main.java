import java.util.Arrays;

import Education_practice.Algorithms.*;
import Education_practice.DataStructures.*;
import JeffEriksonAlgorithms.LatticeMultiplying;

public class Main {
    public static void main(String[] args){

//        BasicArray array = new BasicArray(1,2,3,4,5,6);
//        String copy= array.toString();
//        System.out.println(copy);
//        array.append(1234);
//        System.out.println(array);
//        array.remove(0);
//        System.out.println(array);
//        array.remove(5);
//        System.out.println(array);

        int[] data ={13,34,5,23,11,3,0,1453,13,12512,1,2,3,5,4,124};
        System.out.println(Arrays.toString(data)+"\n");
        MergeSort mergeSortTest = new MergeSort();
        System.out.println(Arrays.toString(mergeSortTest.merge(data)));

        StackBasedWithArray stack = new StackBasedWithArray();
        stack.put('a');
        stack.put('a');
        stack.put('a');
        stack.put('a');
        System.out.println(stack);
//        OddEvenSort sort= new OddEvenSort();
//        System.out.println(Arrays.toString(sort.sort(data)));

//        BubbleSort sort = new BubbleSort();
//        System.out.println(Arrays.toString(sort.variantOne(data)));

//        SelectionSort selectionSort= new SelectionSort();
//        System.out.println(Arrays.toString(selectionSort.sort(data))+"\n------------");
//
//        InsertionSort insertion = new InsertionSort();
//        System.out.println(Arrays.toString(insertion.sort_no_duplicates(data)));
        PairsOfBrackets pairs = new PairsOfBrackets();
        pairs.isValid("a{b(c]d}e");

        RPN rpn = new RPN("A*(B+C)");
        System.out.println(rpn.proceed());

        SortedStack sortedStack = new SortedStack();
        char[] dataSortedStack = {'a','x','c','A',' '};
        for(char i:dataSortedStack){
            sortedStack.put(i);
        }
        System.out.println(sortedStack);


        QueueBasedWithArray queue = new QueueBasedWithArray();
        System.out.println(queue.isEmpty());


        LatticeMultiplying multiplying = new LatticeMultiplying(12,34);
        System.out.println(multiplying.multiply());
    }
}