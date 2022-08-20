package week3.day5;

public class MyHouse {
    public static void main(String[] args) {
        Plan land = new Land();
        Land land2 = new Land();
        //Methods from interface
        land.buildBedRooms(3);
        land.buildKitchen();
        land.buildParking();
        //Methods from Class
        land2.buildBalcaony();
    }

}

