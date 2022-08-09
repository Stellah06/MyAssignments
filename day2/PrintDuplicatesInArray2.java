package week1.day2;

public class PrintDuplicatesInArray2 {

    public static void main(String[] args) {
        int[] arr1 = {14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20};
        int arrLength = arr1.length;
        int count;
        for (int i = 0; i <= arrLength - 1; i++) {
            count = 0;
            for (int j = i; j < arrLength; j++) {
                if (arr1[i] == arr1[j]) {
                    count++;
                }
            }
            if (count > 1) {
                System.out.println("Index " + i + " " + "Value " + arr1[i]);
            }
        }
    }
}
