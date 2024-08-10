package CodeRun.Season_2.Easy;

import java.io.*;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;

public class SuperMegaMarathon {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] inp = reader.readLine().split(":");
        String[] inp2 = reader.readLine().split(":");
//        int startDif = Math.abs();
//        int startSecond = Integer.parseInt(inp[0])*60+Integer.parseInt(inp[1]);
//        inp = reader.readLine().split(":");
//        int durationFirst = Integer.parseInt(inp[0])*60+Integer.parseInt(inp[1]);
//        inp = reader.readLine().split(":");
//        int durationSecond = Integer.parseInt(inp[0])*60+Integer.parseInt(inp[1]);
//        int speedDif = Math.abs(durationSecond-durationFirst);
//        System.out.println(speedDif);
//
//        System.out.println(startDif);
//        if(startDif%speedDif!=0){
//            System.out.println("Never");
//        }else{
//            if(startSecond<startFirst){
//                int bubble = startSecond;
//                startSecond=startFirst;
//                startFirst=bubble;
//
//                bubble=durationSecond;
//                durationSecond=durationFirst;
//                durationFirst=bubble;
//            }
//            int meetTime = startFirst+startDif/speedDif*durationFirst;
//            System.out.println(meetTime/60+":"+meetTime%60);
//
//        }

//        LocalTime startFirst = LocalTime.of(Integer.parseInt(inp[0]),Integer.parseInt(inp[1]));
//        inp = reader.readLine().split(":");
//        LocalTime startSecond = LocalTime.of(Integer.parseInt(inp[0]),Integer.parseInt(inp[1]));
//        System.out.println(startFirst);

        reader.close();
        writer.close();
    }
}
