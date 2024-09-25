package CodeRun.Season_2.Easy;

import java.beans.PropertyEditorSupport;
import java.io.*;

//NOT SOLVED!!!!!!!!
public class PrintSum {
    static byte inputNumber;
    static String result="";
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        inputNumber = Byte.parseByte(reader.readLine());

        for(int i=1;i<=inputNumber;i++){
            result  = ""+i;
           expand(i,i,result);
        }
        System.out.println(inputNumber);
        reader.close();
    }
    static void expand(int curMax, int tempSum ,String res){
        String toSave=res;
        for(int j=1;j<=curMax;j++) {
            if (tempSum+j<=inputNumber){
                res=res.concat(" + ").concat(j+"");
            }
            res=complete(res,j,tempSum);
            System.out.println(res);

            res=toSave;
        }
    }

    static String complete(String str, int iter,int tempSum){
        while(tempSum+iter<inputNumber){
            str=str.concat(" + ").concat(iter+"");
            tempSum+=iter;
        }
        return str;
    }
}
