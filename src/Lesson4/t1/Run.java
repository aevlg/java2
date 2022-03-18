package Lesson4.t1;


import java.util.*;
import java.util.List;

public class Run {

    public static int arraySize = 100;
    public static String[] array = new String[arraySize];
   public static List <String> stringList = Arrays.asList(array);


    public static void main(String[] args) {

        createArray();

        System.out.println("РАЗМЕР СПИСКА: " + stringList.size());
        HashSet<String> set = new HashSet<String>(stringList);
        System.out.println("УСТАНОВИТЬ РАЗМЕР: " + set.size());


        HashMap<String, Integer> result = new HashMap<>();
        for (String string: set){

            result.put(string, counting(string));

        }

        System.out.println(result);
    }
    public static void createArray(){
        Random random = new Random();
        for (int i =0; i < arraySize; i ++){

            array[i]=String.valueOf(random.nextInt(20));

        }
    }
    public static Integer counting (String string){
        Integer result = 0;
        for (String str : stringList) {
            if (str.equals(string)) result++;
        }
        return result;
    }




}


