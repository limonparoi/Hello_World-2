package Class8;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class ListTest {

    public static void main(String[] args) {
        List<String> strings= new ArrayList<>();
        strings.add("Washim");
        strings.add("Zaim");
        strings.add("Leemon");
        strings.add("Shahida");

        for (String str:strings){
            System.out.println(str);
        }
        System.out.println("===========================================");
        strings.add(0,"Rishad");
        for (String str:strings){
            System.out.println(str);
        }
        strings.add("Fahmida");
        System.out.println("===========================================");
        strings.remove(3);
        for (String str:strings){
            System.out.println(str);
        }

        List<String> fruits= new ArrayList<>();
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Jack");

        strings.addAll(fruits);
        for (String str:strings){
            System.out.println(str);
        }
        System.out.println("===========================================");
        strings.removeAll(fruits);
        for (String str:strings){
            System.out.println(str);
        }
        System.out.println("===========================================");
        List<Integer> integers = new ArrayList<>();
        integers.add(25);
        integers.add(98);
        integers.add(70);
        for (Integer integer:integers){
            System.out.println(integer);
        }
    }
}
