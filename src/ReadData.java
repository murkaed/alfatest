import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class ReadData {


    public static void main(String[] args) throws IOException {


        File file = new File("src/data.txt");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String data = reader.readLine();
        ArrayList<Integer> var = new ArrayList<>();

        for(String s:data.split(",")){
        var.add(Integer.parseInt(s));
        }


        Collections.sort(var);
        print(var);
        System.out.println();
        Collections.reverse(var);
        print(var);

    }



    public static void print(ArrayList r){
       for(Object s : r){
           System.out.println(s.toString());
       }
    }


}
