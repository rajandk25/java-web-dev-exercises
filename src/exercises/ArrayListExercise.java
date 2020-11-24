package exercises;


import java.util.ArrayList;

public class ArrayListExercise {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<String> letters = new ArrayList<>();

        numbers.add(5);
        numbers.add(3);
        numbers.add(6);
        numbers.add(9);
        numbers.add(1);
        numbers.add(5);
        numbers.add(4);
        numbers.add(6);
        numbers.add(2);
        numbers.add(8);
        System.out.println(sum(numbers));

        letters.add("five");
        letters.add("fivee");
        System.out.println(fiveLetters(letters));

    }
    public static Integer sum(ArrayList<Integer> numbers){
        int sum = 0;
        for(int i = 0; i < numbers.size(); i++) {
            int num = numbers.get(i);
            if(num % 2 == 0){
                sum += num;
            }
        }
        return sum;
    }
    public static String fiveLetters(ArrayList<String> words){
        String str = "";
        for(int i = 0; i < words.size(); i++){
            String s = words.get(i);
            if(s.length() == 5){
              str += s;
            }
        }
        return str;
    }


}
