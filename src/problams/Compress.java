package problams;

public class Compress {

    public static String compress(String s) {

        String result ="";
        int j = 0;
        int i =0;
        while (j < s.length()){

            String character  = String.valueOf(s.charAt(j));
            if (s.charAt(j) == s.charAt(i)){
                j += 1;
                if(j == s.length()){
                    int count = j - i;
                    if(count > 1){
                        result += "" + count + s.charAt(i);
                    }else{
                        result += "" + s.charAt(i);
                    }
                }
            }else{
                int count = j - i;
                if(count > 1){
                    result += "" + count + s.charAt(i);
                }else{
                    result += "" + s.charAt(i);
                }

                i = j;
            }

        }

        return result;
    }

    public static void main(String[] args){
        String result = compress("akkkkppi");
        System.out.println(result);
    }
}
