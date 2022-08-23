package week3.day6;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String name="PayPal";
        Set<Character> charSet=new HashSet<Character>();
        Set<Character> dupCharSet=new HashSet<Character>();
        for(int i=0;i<name.length();i++){
            if(charSet.contains(name.charAt(i))){
                dupCharSet.add(name.charAt(i));
            }else{
                charSet.add(name.charAt(i));
            }
        }
        System.out.println("Unique letters are "+charSet);
        System.out.println("Duplicate letters are "+dupCharSet);
        for (Character letter:dupCharSet) {
            if(charSet.contains(letter)){
                charSet.remove(letter);
            }
        }
        System.out.println("After removing duplicates");
        System.out.println("Unique letters are "+charSet);
        System.out.println("Duplicate letters are "+dupCharSet);
    }
}
