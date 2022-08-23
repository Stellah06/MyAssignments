package week3.day6;

import java.util.ArrayList;
import java.util.List;

public class FindNumber {
    public static void main(String[] args) {
        List<Integer> intlist=new ArrayList<Integer>();
        intlist.add(1);
        intlist.add(22);
        intlist.add(3);
        intlist.add(54);
        intlist.add(65);
        intlist.add(22);
        intlist.add(43);
        //initialize count
        int count=0;
        for(int eachNum:intlist){
            if(eachNum==22){
                count++;
            }
        }
        System.out.println("Number of times 22 is in list is "+count);

    }
}
