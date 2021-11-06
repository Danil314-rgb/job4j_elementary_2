package map;

import java.util.HashMap;
import java.util.List;

public class OrderConvert {

    public static HashMap<String, Order> process(List<Order> orders) {
        HashMap<String, Order> map = new HashMap<>();
        for (Order item : orders) {
            map.put(item.getNumber(), item);
        }
        return map;
    }
}
