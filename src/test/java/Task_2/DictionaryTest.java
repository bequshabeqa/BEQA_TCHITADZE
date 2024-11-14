package Task_2;

public class DictionaryTest {
    public static void main(String[] args) {

        Dictionary.add("მანქანა", "ტრანსპორტი, რომელსაც ხშირად ვიყენებთ");
        Dictionary.add("ძაღლი", "მეგობრული ცხოველი, რომელიც ასევე იცავს სახლ-კარს.");
        Dictionary.add("ლექსიკონი", "სიტყვათა კრებული, რომელიც გვეხმარება სიტყვების სხვადასხვა მნიშვნელობების გაგებაში");

        Dictionary.remove("ძაღლი");

        Dictionary.print("ლექსიკონი");

        Dictionary.printAll();
    }
}
