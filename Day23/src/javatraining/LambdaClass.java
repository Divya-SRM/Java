package javatraining;

import java.util.ArrayList;

public class LambdaClass {
    public static void main(String[] args) {
       
        ArrayList<String> languages = new ArrayList<>();
        languages.add("java");
        languages.add("react");
        languages.add("python");
        System.out.println("ArrayList: " + languages);
        languages.replaceAll(e -> e.toUpperCase());
        System.out.println("Updated ArrayList: " + languages);
    }
}