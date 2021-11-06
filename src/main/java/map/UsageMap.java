package map;

import java.util.HashMap;
import java.util.Map;

public class UsageMap {

    public static void main(String[] args) {
        Map<String, String> mail = new HashMap<>();
        mail.put("Aleks@mail.ru", "Polov Aleksandr Ivanovich");
        mail.put("IvanPI@gmail.com", "Polov Ivav Ivanovich");
        mail.put("SanSanNov@mail.ru", "Novov Aleksandr Aleksandrovich");

        for (String key : mail.keySet()) {
            String value = mail.get(key);
            System.out.println(key + " = " + value);
        }
    }
}
