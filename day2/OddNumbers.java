package week1.day2;

import java.util.Arrays;

public class OddNumbers {
    public static void main(String[] args) {

        int[] numbers={22,67,98,1,34,58,99};
        Arrays.sort(numbers);
        int arrayLength=numbers.length;
        System.out.println("Second largest number="+numbers[arrayLength-2]);
        System.out.println("--------------------------------");
        for(int i = 51;i<78; i += 2){
            System.out.println(i);
        }

    }
}
