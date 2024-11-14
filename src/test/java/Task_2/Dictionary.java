package Task_2;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    public static void main(String[] args) {

    }

        private static Map<String, String> dictionary = new HashMap<>();

        public static void add (String word1, String word2){
            dictionary.put(word1, word2);
        }

        public static void remove (String word1){
            if (dictionary.containsKey(word1)) {
                dictionary.remove(word1);
                System.out.println("სიტყვა " + word1 + " წაიშალა.");
            } else {
                System.out.println("სიტყვა " + word1 + " არ არსებობს.");
            }
        }

        public static void print (String word1){
            if (dictionary.containsKey(word1)) {
                System.out.println("სიტყვა: " + word1 + ", მნიშვნელობა: " + dictionary.get(word1) + "");
            } else {
                System.out.println("სიტყვა " + word1 + " არ არსებობს.");
            }
        }
        public static void printAll () {
            if (dictionary.isEmpty()) {
                System.out.println("ცარიელია: ");
            } else {
                System.out.println("ყველა სიტყვა");
                for (Map.Entry<String, String> entry : dictionary.entrySet()) {
                    System.out.println("სიტყვა: \"" + entry.getKey() + "\", მნიშვნელობა: \"" + entry.getValue() + "\"");
                }
            }
        }
    }

