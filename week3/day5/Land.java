package week3.day5;

public class Land implements Plan {

    @Override
    public void buildBedRooms(int num) {
        System.out.println("Bedrooms constructed");
    }

    @Override
    public void buildParking() {
        System.out.println("Parking constructed");
    }

    @Override
    public void buildKitchen() {
        System.out.println("Kitchen constructed");
    }
    public void buildBalcaony(){
        System.out.println("Balcony constructed");
    }
}
