package week3.day6;

import java.util.ArrayList;
import java.util.List;

public class FindNameWithS {
    public static void main(String[] args) {
        List<String> names=new ArrayList<String>();
        names.add("Karthi");
        names.add("Arun");
        names.add("Dev");
        names.add("Selva");
        names.add("Anbu");
        names.add("Sekar");
        System.out.println("Names starting with S");
        for(String eachName:names){
            if(eachName.startsWith("S")){
                System.out.println(eachName);
            }
        }


    }
}
