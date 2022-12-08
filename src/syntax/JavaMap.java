package syntax;


import java.util.Arrays;
import java.util.Map;

public class JavaMap {

    public static void main(String[] args) {
        Map<Integer, String> javaMap = Map.of(1, "Chicago",
                2, "New York",
                3, "Portland");

        int[] nums = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(javaMap.entrySet().toArray()));
    }

}





