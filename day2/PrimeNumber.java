package week1.day2;

public class PrimeNumber {
    public static void main(String[] args) {
        int num = 53;
        int count = 0;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count > 0) {
            System.out.println("Number is non prime");
        } else {
            System.out.println("Number is prime");
        }

    }
}

