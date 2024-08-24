package problams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class PairSum {

    public static List<Integer> pairSum(List<Integer> numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i =0; i < numbers.size(); i++){
            int data = target - numbers.get(i);
            if(map.containsValue(data)){

                int index = numbers.indexOf(data);
                ArrayList<Integer> liat = new ArrayList<Integer>();
                liat.add(i);
                liat.add(index);

                return liat;
            }else{
                map.put(i, numbers.get(i));
            }
        }
        return new ArrayList<Integer>();

    }
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4, 7, 5, 1, 2));
        ArrayList<Integer> result = (ArrayList<Integer>) pairSum(list, 6);
        System.out.println(result);

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(4, 7, 9, 2, 5, 1));
        ArrayList<Integer> result2 = (ArrayList<Integer>) pairSum(list1, 3);
        System.out.println(result2);
    }
}
