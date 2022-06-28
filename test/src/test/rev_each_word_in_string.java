package test;
import java.util.Scanner;
public class rev_each_word_in_string
{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Original string : ");
    String os= scanner.nextLine();
    scanner.close();
 
    String words[] =os.split("\\s");
    String reversedString = "";
 
    for (int i = 0; i < words.length; i++) 
    {
      String word = words[i];
      String reverseWord = "";
      for (int j = word.length() - 1; j >= 0; j--) 
      {
        reverseWord = reverseWord + word.charAt(j);
      }
      reversedString = reversedString + reverseWord + " ";
    }
    System.out.print(reversedString);
  }
}
 
