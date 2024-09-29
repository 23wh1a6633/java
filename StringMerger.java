import java.util.*;

public class StringMerger 
{
    public static void main(String s[]) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string : ");
        String s1 = scanner.nextLine();
        System.out.print("Enter the second string : ");
        String s2 = scanner.nextLine();

        String mergedString = mergeStrings(s1, s2);

        System.out.println("Merged string: " + mergedString);

        scanner.close();
    }

    public static String mergeStrings(String s1, String s2) 
    {
        StringBuilder merged = new StringBuilder();
        int i = 0, j = 0;
        while (i < s1.length() && j < s2.length()) 
        {
            merged.append(s1.charAt(i++));
            merged.append(s2.charAt(j++));
        }
        while (i < s1.length()) 
        {
            merged.append(s1.charAt(i++));
        }
        while (j < s2.length()) 
        {
            merged.append(s2.charAt(j++));
        }
        return merged.toString();
    }
}