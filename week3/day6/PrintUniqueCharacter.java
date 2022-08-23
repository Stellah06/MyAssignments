package week3.day6;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {
    public static void main(String[] args) {
        String myName="Stellahmary";
        Set<Character> eachLetter=new HashSet<Character>();
        int length=myName.length();
        //Add all letter to Set and display letters in Set
        for(int i=0;i<length;i++){
            eachLetter.add(myName.charAt(i));
        }
        System.out.println("Unique letters in my name are "+eachLetter);
    }
}
