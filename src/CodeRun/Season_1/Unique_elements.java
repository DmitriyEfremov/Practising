package CodeRun.Season_1;

import java.io.*;
// Задача с CodeRun
public class Unique_elements {
    public static void main(String[] args) {
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        int len,cnt=0;
        long[] nums;
        try {
            len = Integer.parseInt(reader.readLine());
            nums = new long[len];
            if(len==0){
                System.out.println(0);
            }else {
                cnt++;
                String[] data = reader.readLine().split(" ");
                nums[0] = Integer.parseInt(data[0]);
                for (int i = 1; i < len; i++) {
                    int j = i;
                    while (j > 0 && nums[j - 1] > nums[j]) {
                        nums[j] = nums[j - 1];
                        j--;
                    }
                    nums[j] = Integer.parseInt(data[i]);
                }
                for (int i = 0; i < len - 1; i++) {
                    int j = i + 1;
                    if (nums[i] == nums[j]) {
                        while (nums[j] == nums[i] && j<len-1) {
                            j++;
                        }
                        i = j - 1;
                    } else cnt++;
                }
                System.out.println(cnt);
            }
        }catch(IOException e){
            System.out.println("exception caught");
        }

    }
}