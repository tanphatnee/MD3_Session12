import java.util.HashMap;
import java.util.Map;

/** cho 1 đoạn văn bản (cho sẵn hoặc nhập vào) đếm số lần xuất hiện của từng ký tự.*/
public class BT {
    public static void main(String[] args) {
        String str = "hello world dsfs dsg ggrtgrggdf";
        str = str.replaceAll(" ", "");
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char key = str.charAt(i);
            if(map.containsKey(key)) {
                int value = map.get(key) + 1;
                map.put(key,value);
            }else map.put(key, 1);
        }
        System.out.println(map);
    }

}
