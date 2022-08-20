package week3.day5;

public class MyVehicle {
    public static void main(String[] args) {
        BMW bmw=new BMW();
        Audi audi=new Audi();
        //BMW access Vehicle methods
        System.out.println("With BMW object");
        bmw.applyBrake();
        bmw.soundHorn();
        //BMW access car method
        bmw.myCar();
        //BMW access own method
        bmw.myBMW();

        System.out.println("With Audi object");
        //AUDI access Vehicle methods
        audi.applyBrake();
        audi.soundHorn();
        //AUDI access car method
         audi.myCar();
        //AUDI access own method
        audi.myAudi();

        Auto auto=new Auto();
        System.out.println("With Auto object");
        //Auto access Vehicle methods
        auto.applyBrake();
        auto.soundHorn();
        //Auto access own method
        auto.myAuto();

        Bajaj bj=new Bajaj();
        System.out.println("With Bajaj object");
        //Bajaj access Vehicle methods
        bj.applyBrake();
        bj.soundHorn();
        //Bajaj access Auto method
        bj.myAuto();
        //Bajaj access own method
        bj.myBajaj();

    }

}
