package week3.day5;

public interface Plan {
    /**
     * Plan for bedroom
     *
     * @param num number of rooms
     * @author Stella
     */
    public void buildBedRooms(int num);

    public void buildParking();

    public void buildKitchen();

    // Static final variables
    int landArea = 2400;
    String villaName = "RJ Villa";

}
