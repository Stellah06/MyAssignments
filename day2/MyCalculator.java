package week1.day2;

public class MyCalculator extends Calculator{
    public static void main(String[] args){
        MyCalculator obj=new MyCalculator();
        int sum=obj.add(345,234,656);
        System.out.printf("Sum is "+ sum+"\n" );
        obj.sub(2345,1123);
        double product=obj.product(3414.987,7526.976);
        System.out.println("Product is "+ product);
        float div= obj.division(234.467f,13.65f);
        System.out.println("Quotient is "+div);
    }
}
