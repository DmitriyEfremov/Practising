package Education_practice.Algorithms;

public class Binary_search {



    //сложность O(log(n)) - в худшем случае
    public static void main(String[] args) {
        System.out.println(binary_search(12));
    }
    // использование алгоритмов поиска ускоряет доступ к элементам структур данных (?)
    // двоичный поиск можно использовать для быстрого поиска позиции для вставки нового элемента
    // в отсортированный массив
    static int[] input = {1,2,4,12,23,30,31,45,46,48,57,69};
    static int low = 0, upper = input.length-1;
    static int binary_search(int val){
        while(true){
            int t = (upper + low + 1)/2;
            if (input[t] == val){
                return t;
            }
            if(input[t] > val){
                upper = t;
            }else if(input[t] < val){
                low = t;
            }
        }

    }
}
