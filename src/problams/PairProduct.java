package problams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class PairProduct {

    public static List<Integer> pairProduct(List<Integer> numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i =0; i < numbers.size(); i++){
            int value =   target / numbers.get(i);
            if(map.containsKey(value)){

                int index = map.get(value);
                return  List.of(i, index);

            }
            map.put(numbers.get(i), i);
        }
        return  new ArrayList<>();
    }

    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4, 7, 5, 1, 2));
        List<Integer> data = pairProduct(list, 8);
        System.out.println(data);

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(4, 7, 9, 2, 5, 1));

    }
}
