package problams;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class anagrams {
    public static boolean anagrams(String s1, String s2){
        HashMap<String, Integer> map1 = new HashMap<>();
        for(int i =0; i < s1.length(); i++){
            char wrd = s1.charAt(i);
            if(map1.containsKey(String.valueOf(wrd))){
                map1.put(String.valueOf(wrd), map1.get(String.valueOf(wrd)) + 1);
            }else{
                map1.put(String.valueOf(wrd),  1);
            }

        }
        System.out.println(map1);
        HashMap<String, Integer> map2 = new HashMap<>();
        for(int i =0; i < s2.length(); i++){
            char wrd = s2.charAt(i);
//            map2.put(String.valueOf(wrd), map2.get(String.valueOf(wrd)) + 1);
            if(map2.containsKey(String.valueOf(wrd))){
                map2.put(String.valueOf(wrd), map2.get(String.valueOf(wrd)) + 1);
            }else{
                map2.put(String.valueOf(wrd),  1);
            }
        }
        System.out.println(map2);
        if(map1.size() != map2.size()){
            return false;
        }
        boolean result = false;
        for(Map.Entry<String, Integer> entry : map1.entrySet()){

            if(map2.containsKey(entry.getKey())){
                Integer value = map2.get(entry.getKey());

                if(!Objects.equals(value, entry.getValue())){

                    return false;
                }else{
                    result = true;
                }
            }else{
                return  false;
            }
        }
        return result;
    }
    public static void main(String[] args){
       boolean value = anagrams("tax", "taxi");
       System.out.println(value);

        boolean value1 = anagrams("Caterpe", "aCteepr");
        System.out.println(value1);

        boolean value2 = anagrams("fla", "fly");
        System.out.println(value2);
    }
}
