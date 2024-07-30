package CodeRun.Season_1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Emoboy {
    public static void main(String[] args) {
        Scanner scn  = new Scanner(System.in);
        Pattern p = Pattern.compile("\\d+");
        Pattern p1 = Pattern.compile("[a-z]+");
        Pattern p2 = Pattern.compile("[A-Z]+");
        String inp = scn.next();
        Matcher m = p.matcher(inp);
        Matcher m1 = p1.matcher(inp);
        Matcher m2 = p2.matcher(inp);
        if (m.matches()&&m1.matches()&&m2.matches()) System.out.println("YES");
        else System.out.println("NO");
    }
}
