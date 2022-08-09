package week1.day2;

public class MissingNumber {
    public static void main(String[] args) {
        int[] num={1,2,3,4,6,7,8};
        for(int i=0;i< num.length;i++){
            if(num[i]!=i+1){
                System.out.println("Missing number is "+(i+1));
                break;
            }
        }
    }
}
