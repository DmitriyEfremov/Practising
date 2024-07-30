package CodeRun.Season_2.Easy;

import java.io.*;
import java.util.HashMap;

public class Board {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<String,Integer> points= new HashMap<>();
        int amountOfPlayers = Integer.parseInt(reader.readLine());
        for(int i=0;i<amountOfPlayers;i++){
            points.put(reader.readLine(),0);
        }

        int prevFirst=0;
        int prevSecond=0;
        int amountOfUpdates=Integer.parseInt(reader.readLine());
        for(int i=0;i<amountOfUpdates;i++){
            String[] inp = reader.readLine().split(" ");
            String[] current = inp[0].split(":");
            int curFirst = Integer.parseInt(current[0]);
            int curSecond = Integer.parseInt(current[1]);
            points.put(inp[1],points.get(inp[1])+curFirst-prevFirst+curSecond-prevSecond);
            prevFirst=curFirst;
            prevSecond=curSecond;
        }
        int max=0;
        String name="";
        for(String s: points.keySet()){
            if (points.get(s)>max || points.get(s)==max &&s.compareTo(name)>0){
                name=s;
                max=points.get(s);
            }
        }
        System.out.println(name+" "+max);
        reader.close();
        writer.close();
    }
}
