package week1.day2;

public class FibbinocciSeries {
    public static void main(String[] args) {
        int sum=0,Num1=0,Num2=1;
        int n=9;
        System.out.println(Num1);
        System.out.println(Num2);
        for(int i=0;i<=n;i++){
            sum=Num1+Num2;
            System.out.println(sum);
            Num1=Num2;
            Num2=sum;
        }
    }
}
