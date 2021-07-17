package javatraining;
import java.util.ArrayList;

public class LambaArray
{

public static void main(String[] args) {
    ArrayList<String> languages = new ArrayList<>();
    languages.add("Tamil");
    languages.add("English");
    languages.add("Maths");
    System.out.println("ArrayList: ");
    languages.forEach((e) -> {
      System.out.println(e);
    });
  }
}