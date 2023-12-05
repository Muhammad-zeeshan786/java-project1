// Duplicate element in an Array
import java.util.HashMap;
import java.util.Map;

public class javaProjectQ8 {

        public static void main(String[] args) {
            String[] stringsArray = {"apple", "banana", "orange", "apple", "grape", "banana", "kiwi"};

            printDuplicateElements(stringsArray);
        }

        private static void printDuplicateElements(String[] arr) {
            Map<String, Integer> elementCountMap = new HashMap<>();

            for (String element : arr) {
                elementCountMap.put(element, elementCountMap.getOrDefault(element, 0) + 1);
            }

            System.out.println("Duplicate elements in the array:");
            for (Map.Entry<String, Integer> entry : elementCountMap.entrySet()) {
                if (entry.getValue() > 1) {
                    System.out.println(entry.getKey());
                }
            }
        }
    }

