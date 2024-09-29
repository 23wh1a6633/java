import java.util.*;

public class PangramChecker 
{
    public static void main(String s[]) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string : ");
        String sentence = scanner.nextLine();

        if (isPangram(sentence)) 
        {
            System.out.println(1);
        } else 
        {
            System.out.println(-1);
        }

        scanner.close();
    }

    public static boolean isPangram(String sentence) 
    {
        boolean[] alphabet = new boolean[26];
        int index = 0;
        sentence = sentence.toLowerCase();

        for (int i = 0; i < sentence.length(); i++) 
        {
            if ('a' <= sentence.charAt(i) && sentence.charAt(i) <= 'z')
            {
                index = sentence.charAt(i) - 'a';
                alphabet[index] = true;
            }
        }

        for (int i = 0; i < 26; i++) 
        {
            if (!alphabet[i]) 
            {
                return false;
            }
        }
        return true;
    }
}