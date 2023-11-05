package Class8;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Set<Double> number= new HashSet<>();
        number.add(98.21);
        number.add(75.00);
        number.add(65.50);

//        for (Double dub:number){
//            System.out.println(dub);
//        }

        number.add(10.25);
        number.remove(98.21);
        number.add(75.00);

        for (Double aDouble:number){
            System.out.println(aDouble);
        }

    }
}
