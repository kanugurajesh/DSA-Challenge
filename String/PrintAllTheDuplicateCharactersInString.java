import java.util.Map;
import java.util.HashMap;

public class DuplicateStrings {

        public static void printall(String str) {
                HashMap<Character, Integer> map = new HashMap<>();

                for(int i=0;i<str.length();i++) {
                        map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
                }

                for (Map.Entry<Character, Integer> entry : map.entrySet()) {                        if (entry.getValue() > 1) {
                                System.out.println("Character: " + entry.getKey() + ", Count: " + entry.getValue());
                        }
                }

        }

        public static void main(String[] args) {
                String str = "geeksforgeeks";
                printall(str);
        }
}
