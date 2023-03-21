package exam3;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        String [] strings= {"","asa","asaa"};
        System.out.println(findLongest(strings));


        Map<String, Integer> map = new HashMap<>();
        map.put("Onik", 50);
        map.put("Aram", 51);
        map.put("Vazgen", 52);
        map.put("Harut", 53);
        System.out.println(biggerThanFifth(map));


        List<String> strings1=new ArrayList<>(Arrays.asList("Onik","Vaxo","Hambardzum"));

        int[] stringsLength = createStringsLength(strings1);

        for (int i = 0; i <stringsLength.length ; i++) {
            System.out.print(stringsLength[i] + " " );
        }
    }

    public static Set<String> biggerThanFifth(Map<String, Integer> map) {

        Set<String> keys = new HashSet<>();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 50) {
                keys.add(entry.getKey());
            }
        }
        return keys;

    }


    public static String findLongest(String[] strings) {
        String s = "";
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length() > s.length()) {
                s = strings[i];
            }
        }
        return s;
    }

    public static int [] createStringsLength(List<String> strings){
        int[] array = new int[strings.size()];
        for (int i = 0; i <array.length ; i++) {
            array[i]=strings.get(i).length();
        }
        return array;
    }
}
