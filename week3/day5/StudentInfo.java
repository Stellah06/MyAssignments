package week3.day5;

public class StudentInfo {
    public void getStudentInfo(String name){
        String fname=name;
        System.out.println(fname);
    }
    public int getStudentInfo(){
        return 10;
    }
    public void getStudentInfo(String fname,String lname){
        System.out.println(fname+" "+lname);
    }
    public void getStudentInfo(int yr){
        System.out.println("Student is in "+yr);
    }

    public static void main(String[] args) {
        //obj creation
        StudentInfo si=new StudentInfo();
        //calling overloaded functions with obj
        si.getStudentInfo("SMJ");
        si.getStudentInfo(3);
        int rollNo=si.getStudentInfo();
        System.out.println("Roll Number is "+rollNo);
        si.getStudentInfo("Stellah","J");
    }
}
