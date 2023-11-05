package Class8;
import java.util.Objects;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MapTest {
    public static void main(String[] args) {
        Map<String, Object> map=new HashMap<>();
        map.put("name", "wasid");
        map.put("number",85);
        map.put("Point",3.98);
        //System.out.println(map);

        System.out.println(map.get("point"));
        map.put("Salary", 65844);


        Map<String, Object> map1= new HashMap<>();
        map1.put("name", "wasid");
        map1.put("number",85);
        map1.put("Point",3.98);

        map.put("map1", map1);
        System.out.println(map);
    }


}
