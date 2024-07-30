package CodeRun.Season_2.Middle;

import java.io.*;
import java.util.HashMap;

public class EnormousNumbersGCD {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<Integer, Integer> firstNumberOfDividers = new HashMap<>();
        HashMap<Integer, Integer> secondNumberOfDividers = new HashMap<>();
        int firstNumberAmountOfMultipliers = Integer.parseInt(reader.readLine());
        String[] data = reader.readLine().split(" ");
        for (String multiplier : data) {
            int number = Integer.parseInt(multiplier);
            for (int i = 2; i < number + 1; i++) {
                while (number % i == 0) {
                    if (firstNumberOfDividers.containsKey(i)) {
                        firstNumberOfDividers.put(i, firstNumberOfDividers.get(i) + 1);
                    } else {
                        firstNumberOfDividers.put(i, 1);
                    }
                    number /= i;
                }
            }
        }
        int secondNumberAmountOfMultipliers = Integer.parseInt(reader.readLine());
        data = reader.readLine().split(" ");
        for (String multiplier : data) {
            int number = Integer.parseInt(multiplier);
            for (int i = 2; i < number + 1; i++) {
                while (number % i == 0) {
                    if (secondNumberOfDividers.containsKey(i)) {
                        secondNumberOfDividers.put(i, secondNumberOfDividers.get(i) + 1);
                    } else {
                        secondNumberOfDividers.put(i, 1);
                    }
                    number /= i;
                }
            }
        }
        long GCD = 1L;
        for (int i : firstNumberOfDividers.keySet()) {
            if (secondNumberOfDividers.containsKey(i)) {
                int min = Math.min(firstNumberOfDividers.get(i), secondNumberOfDividers.get(i));
                GCD = GCD * (long) Math.pow(i, min);
            }
        }
        if ((GCD + "").length() <= 9) {
            System.out.println(GCD);
        } else {
            System.out.println((GCD + "").substring((GCD + "").length() - 9));
        }
        reader.close();
        writer.close();
    }

}
