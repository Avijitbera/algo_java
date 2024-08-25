package problams;

import java.util.HashMap;

public class Uncompress {

    public static String uncompress(String s) {
        String numbers = "0123456789";
        String value = "";
        int i = 0;
        int j = 0;

        while (j < s.length()){
            String character  = String.valueOf(s.charAt(j));
            if(numbers.contains(character)){
                j += 1;
            }else{
                int index = Integer.parseInt(s.substring(i, j));
                value += character.repeat(index);
                j += 1;
                i = j;
            }
        }

        return value;

    }

    public static void main(String[] args){
        String result = uncompress("4k2a9j");
        System.out.println(result);
    }
}
