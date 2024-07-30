package CodeRun.Season_2.Easy;

import java.io.*;

public class TwoTeams {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

            double team_one = Integer.parseInt(reader.readLine());
            double team_two = Integer.parseInt(reader.readLine());
            int max_amount = Integer.parseInt(reader.readLine());

            if(team_one>team_two || team_one>Math.ceil(team_two/max_amount)){
                System.out.println("Yes");
            }else System.out.println("No");

        reader.close();
        writer.close();
    }
}
