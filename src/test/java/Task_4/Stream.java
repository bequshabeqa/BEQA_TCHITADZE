package Task_4;

import java.util.Arrays;
import java.util.List;

public class Stream {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("car", "cab", "credo", "school" );

        for (String word : words) {
            System.out.println(word.toUpperCase());
        }
    }
}
