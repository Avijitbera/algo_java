package problams;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentChar {
    public static char mostFrequentChar(String s){
        HashMap<String, Integer> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++ ){

            if(map.containsKey(String.valueOf(s.charAt(i)))){
                Integer value = map.get(String.valueOf(s.charAt(i)));

                map.replace(String.valueOf(s.charAt(i)), value + 1);
            }else{
                map.put(String.valueOf(s.charAt(i)),  1);
            }

        }

        char wrd = '\0';
        for(int i = 0; i < s.length(); i++ ){
            if(wrd == '\0' ||  map.get(String.valueOf(s.charAt(i))) > map.get(String.valueOf(wrd))){
                wrd = s.charAt(i);
            }
        }
        System.out.println(String.valueOf(wrd));

        return  wrd;
    }
    public static void main(String[] args){
        char value = mostFrequentChar("Moost");
        System.out.println(String.valueOf(value));

        char value1 = mostFrequentChar("bookeeper");
        System.out.println(String.valueOf(value1));

        char value2 = mostFrequentChar("mississippi");
        System.out.println(String.valueOf(value2));
    }
}
