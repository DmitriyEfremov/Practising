package CodeRun.Season_2.Easy;

import java.io.*;

public class NearestBusStop {
    static String[] stops;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        stops = br.readLine().split(" ");

        String[] bus_pos = br.readLine().split(" ");

        for(String s: bus_pos) {

            int position= Integer.parseInt(s);
            int[] a = binary_search(new int[]{0,stops.length-1}, position);
            if(position<=Integer.parseInt(stops[0])){
                System.out.println(1);
            }else if(position>=Integer.parseInt(stops[stops.length-1])){
                System.out.println(stops.length);
            }
            else {
                if (a.length == 1 || Math.abs(position - Integer.parseInt(stops[a[0]])) <= Math.abs(Integer.parseInt(stops[a[1]]) - position)) {
                    System.out.println(a[0] + 1);
                } else {
                    System.out.println(a[1] + 1);
                }
            }
        }


        br.close();
        bw.close();
    }
    static int[] binary_search(int[] indexes, int value){
        int len=indexes[1]-indexes[0]+1;
        if (len<=2){
            return indexes;
        }else{
            int pivot = indexes[0]+len/2;
            if (Integer.parseInt(stops[pivot])<value){
                return binary_search(new int[]{pivot,indexes[1]},value);
            }
            else{
                return binary_search(new int[]{indexes[0],pivot},value);
            }
        }
    }
}
