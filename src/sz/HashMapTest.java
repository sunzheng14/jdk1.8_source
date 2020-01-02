package sz;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("a", "A");
        map.put("b", "B");

        String result = map.get("a");
        System.out.println(result);
    }
}
