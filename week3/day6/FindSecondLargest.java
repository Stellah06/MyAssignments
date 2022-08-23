package week3.day6;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {
    public static void main(String[] args) {
        int[] data = {3, 2, 11, 4, 6, 7, 2, 3, 3, 6, 7};
        Set<Integer> sortedData = new TreeSet<Integer>();
        //add numbers to set to sort and remove duplicate
        for (int i = 0; i < data.length; i++) {
            sortedData.add(data[i]);
        }
        System.out.println("Data in Set is " + sortedData);
        //convert Set data into List
        List<Integer> listOfSetData = new ArrayList<Integer>(sortedData);
        System.out.println("Data in List is " + listOfSetData);
        int size = listOfSetData.size();
        //Print the last but one in the list
        System.out.println("Second largest number is " + listOfSetData.get(size - 2));
    }
}
