package week1.day2;

public class Calculator {

    public int add(int a, int b, int c){
        int sum;
        sum=a+b+c;
        return sum;
    }
    public void sub(int num1, int num2){
        System.out.println("Difference is "+ (num1-num2));
    }
    public double product(double a, double b){
        double c=a*b;
        return c;
    }
    public float division(float num1, float num2){
        float quotient=num1/num2;
        return quotient;
    }
}
