package CodeRun.Season_1;

import java.util.HashMap;
import java.util.Scanner;

public class Calendar_formatting {
    public static void main(String[] args) {

        HashMap<String,Integer> weekdays = new HashMap<>();
        weekdays.put("Monday", 0);
        weekdays.put("Tuesday", 1);
        weekdays.put("Wednesday", 2);
        weekdays.put("Thursday", 3);
        weekdays.put("Friday", 4);
        weekdays.put("Saturday", 5);
        weekdays.put("Sunday", 6);
        Scanner scn = new Scanner(System.in);
        int amount = scn.nextInt();
        int pivot = weekdays.get(scn.next());

        for(int i=0;i<pivot;i++){
            System.out.print(".. ");
        }
        int i=1;
        while(i<=amount){
            String out = (".."+i);
            String o=out.substring(out.length()-2);
            if(pivot==6){
                System.out.println(o);
                pivot=-1;
            }else {
                System.out.print(o + " ");
            }
            pivot++;
            i++;
        }
    }
}
