
import java.util.Arrays;
import java.util.Scanner;
public class AnagramCheck 
	{
   
      public static boolean areAnagrams(String str1, String str2) 
      {
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();
        if (str1.length() != str2.length()) {
            return false;
        }
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
      }
    public static void main(String[] args) 
    	{
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String input1 = scanner.nextLine();

        System.out.print("Enter second string: ");
        String input2 = scanner.nextLine();

        boolean result = areAnagrams(input1, input2);
        System.out.println("Are the two strings anagrams? " + result);

        scanner.close();
        }
      }

