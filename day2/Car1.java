package week1.day2;

public class Car1 {

    public void printCarBrandName() {
        System.out.println("Benz");
    }
    public String getCarColor() {
        return "Black";
    }
    public int getCarEngineNumber() {
        return 23445634;
    }
    public void addTwoNumbers(int a, int b) {
        int c = a + b;
        System.out.println("Sum is " + c);
    }
    public int multiplyTwoNumber(int a, int b) {
        int c = a * b;
        return c;
    }
    public int divideTwoNumbers(int c, int d) {
        int g = c / d;
        return g;
    }
    public static void main(String[] args) {
        Car1 obj1 = new Car1();
        obj1.printCarBrandName();
        System.out.println(obj1.getCarColor());
        System.out.println(obj1.getCarEngineNumber());
        obj1.addTwoNumbers(24, 43);
        int mul = obj1.multiplyTwoNumber(5, 10);
        System.out.println("Multiplied value is " + mul);
        int div = obj1.divideTwoNumbers(50, 5);
        System.out.println("Quotient is " + div);

    }
}
