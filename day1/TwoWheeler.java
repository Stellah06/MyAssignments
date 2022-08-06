package week1.day1;

public class TwoWheeler {
    int noOfWheels=2;
    short noOfMirrors=2;
    long chassisNumber=876542983865378465L;
    boolean isPunctured=false;
    String bikeName="Pulsar";
    double runningKM=160.24;

    public static void main(String[] args) {

        TwoWheeler tw=new TwoWheeler();

        System.out.println("No of wheels "+tw.noOfWheels);
        System.out.println("No of Mirrors "+tw.noOfMirrors);
        System.out.println("Chassis Number is "+tw.chassisNumber);
        System.out.println("Wheel is punctured? "+tw.isPunctured);
        System.out.println("My bike is "+tw.bikeName);
        System.out.println("My bike's driven KM "+tw.runningKM);
    }

}
