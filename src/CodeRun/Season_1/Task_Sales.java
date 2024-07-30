package CodeRun.Season_1;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;


public class Task_Sales {
    public static void main(String[] args) throws IOException {
        HashMap<String,HashMap<String,Integer>> people = new HashMap<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inp;
        ArrayList<String> names= new ArrayList<>();
        ArrayList<String> objects = new ArrayList<>();
            while(!((inp=br.readLine()).isEmpty())){

                String[] data= inp.split(" ");
                if(!objects.contains(data[1])){
                    objects.add(data[1]);
                }
                int a = Integer.parseInt(data[2]);
                if (people.get(data[0])==null){
                    names.add(data[0]);
                    HashMap<String,Integer> temp = new HashMap<>();
                    temp.put(data[1],a);
                    people.put(data[0],temp);
                }else{
                    HashMap<String,Integer> parameters = people.get(data[0]);
                    if(parameters.get(data[1])==null){
                        parameters.put(data[1],a);
                    }else{
                        parameters.put(data[1],parameters.get((data[1]))+a);
                    }
                }

            }
            names.sort(String::compareTo);
            objects.sort(String::compareTo);
        System.out.println(objects);
            for(String s: names){
                System.out.println(s+":");
                for(String g:objects){
                    if ((people.get(s).get(g))!=null){
                        System.out.println(g+" "+people.get(s).get(g));
                    }
                }
            }
        System.out.println(people);
    }
}

