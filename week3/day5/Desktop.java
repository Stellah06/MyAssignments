package week3.day5;

public class Desktop extends Computer{
    public void desktopSize(){
        System.out.println("Desktop screen size is 15 inch");
    }

    public static void main(String[] args) {
        Desktop obj=new Desktop();
        obj.computerModel();
        obj.desktopSize();
    }
}
