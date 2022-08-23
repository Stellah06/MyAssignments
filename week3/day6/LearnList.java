package week3.day6;

import java.util.ArrayList;
import java.util.List;

public class LearnList {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("Karthi");
        names.add("Arun");
        names.add("Dev");
        names.add("Selva");
        names.add("Anbu");
        names.add("Dev");
        names.add("Sekar");
        System.out.println(names);
        names.remove("Dev");
        System.out.println(names);
    }
}