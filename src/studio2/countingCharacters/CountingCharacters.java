package studio2.countingCharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //String str = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there";
        System.out.println("Enter your string to find how many characters are there:");
        String str = input.nextLine();
        stringCount(str.toLowerCase());
    }
    public static void stringCount(String s){
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
        char[] charactersInString = s.toCharArray();
        //checking each char
        for (char letter : charactersInString) {
            if (charCountMap.containsKey(letter)) {
                //if character is present
                charCountMap.put(letter, charCountMap.get(letter) + 1);
            } else {
                //if character is not present
                charCountMap.put(letter, 1);
            }
        }
        //printing
        for (Map.Entry entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());

        }
    }
}

