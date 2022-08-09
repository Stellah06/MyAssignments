package week1.day2;

public class FindIntersection {
    public static void main(String[] args) {
        int[] numList1={3,2,11,4,6,7};
        int[] numList2={1,2,8,4,9,7};
        for(int i=0;i<numList1.length;i++){
            for(int j=0;j< numList2.length;j++){
                if(numList1[i]==numList2[j]){
                    System.out.println("Common number in 2 arrays "+numList1[i]);
                }
            }
        }
    }
}
