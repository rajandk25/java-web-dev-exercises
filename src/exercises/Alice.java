package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Search for a term");
        String string = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        String s = input.nextLine();
        String s2 = string.toLowerCase();
        int position = s2.indexOf(s);
        String remove = s2.replace(s, "");
        if(s2.contains(s.toLowerCase())) {
            System.out.println("true, " + "length: " + s.length() + ", index is: " + position + "\nThe new string is: " + remove );
        }
        else{
            System.out.println("false");
        }
    }
}
