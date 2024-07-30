package CodeRun.Season_2.Middle;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class WorkSchedule {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        HashMap<Integer, ArrayList<Integer>> dayStressTable=new HashMap<>();
        int iter =Integer.parseInt(reader.readLine());
        int maxDay=-1;
        long result=0;
        for(int i = 0;i <iter; i++){
            String[] input = reader.readLine().split(" ");
            int key = Integer.parseInt(input[0]);
            int value = Integer.parseInt(input[1]);
            if(!dayStressTable.containsKey(Integer.parseInt(input[0]))) {
                dayStressTable.put(key, new ArrayList<>());
            }
            int j = dayStressTable.get(key).size();
            while(j>0 && dayStressTable.get(key).get(j-1)<value){
                j--;
            }
            dayStressTable.get(key).add(j,value);
            if(maxDay<key){
                maxDay=key;
            }
            result+=value;
        }
        for(int i=1;i<maxDay+1;i++){
            int dayToGo =-1;
            for(int day: dayStressTable.keySet()){
                if(dayToGo<i || day >= i && (dayStressTable.get(day).size()>day-i && dayStressTable.get(dayToGo).get(0) < dayStressTable.get(day).get(day-i) || dayStressTable.get(dayToGo).get(0).equals(dayStressTable.get(day).get(0)) && day<dayToGo)){
                    dayToGo=day;
                }
            }
            if(dayToGo>=i) {
                result -= dayStressTable.get(dayToGo).get(0);
                dayStressTable.get(dayToGo).remove(0);

                if (dayStressTable.get(dayToGo).isEmpty()) {
                    dayStressTable.remove(dayToGo);
                }
            }
        }
        System.out.println(result);

        reader.close();
        writer.close();

    }
}

