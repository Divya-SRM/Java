package javatraining;


import java.util.Scanner;


public class VowelWords {
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);	 
        System.out.print("Enter an String : ");
        String line = scanner.nextLine();
        int vowels = 0, words = 1;
        line = line.toLowerCase();
        for (int i = 0; i < line.length(); ++i) {
          char ch = line.charAt(i);
          if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            ++vowels;
          }
          if (ch==' ') {
            ++words;
          }
      }
        System.out.println("Vowels: " + vowels);
        System.out.println("Words: " + words);
        scanner.close();
    }
}
