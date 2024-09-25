package TestingContest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class First_SecureData {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String output="";
        int amountOfCandidates = Integer.parseInt(reader.readLine());
        for(int i=0;i<amountOfCandidates;i++){
            HashSet<Character> letters = new HashSet<>();
            String[] input = reader.readLine().split(",");
            int index=(int)input[0].charAt(0)-64;
            int dateSum=0;
            int j=0;
            for(;j<3;j++) {
                for (char ch : input[j].toCharArray()) {
                    letters.add(ch);
                }
            }
            for(;j<5;j++){
                for(char ch:input[j].toCharArray()){
                    dateSum+=Integer.parseInt(ch+"");
                }
            }
            String res="00"+Integer.toHexString(letters.size()+dateSum*64+index*256).toUpperCase();
            output=output.concat(" ").concat(res.substring(res.length()-3));
        }
        System.out.println(output.trim());

        reader.close();
    }
}
