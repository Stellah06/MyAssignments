package week3.day5;

public class AxisBank extends BankInfo{
    @Override
    public void deposit(){
        System.out.println("I deposited 20000rs");
    }
    public void displayDepositedAmount(){
        super.deposit();
        this.deposit();
    }

    public static void main(String[] args) {

        //Object for Axis Bank
        AxisBank ab=new AxisBank();
        ab.saving();
        ab.fixedDeposit();
        ab.deposit();
        ab.displayDepositedAmount();
    }
}
