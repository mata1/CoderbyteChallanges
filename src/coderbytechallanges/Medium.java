package coderbytechallanges;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author matej
 */
public class Medium {

    /*
    Using the Java language, have the function PrimeTime(num) take the num 
    parameter being passed and return the string true if the parameter is a 
    prime number, otherwise return the string false. The range will be between 1 and 2^16. 
    */
    public static boolean primeTime(int num) {
        for (int i = num - 1; i > 1; i--)
            if (num % i == 0)
                return false;
        
        return true;
    }
    
    /*
    Using the Java language, have the function RunLength(str) 
    take the str parameter being passed and return a compressed 
    version of the string using the Run-length encoding algorithm. 
    This algorithm works by taking the occurrence of each repeating 
    character and outputting that number along with a single character 
    of the repeating sequence. For example: "wwwggopp" would return 3w2g1o2p. 
    The string will not contain any numbers, punctuation, or symbols. 
    */
    public static String runLength(String str) {
        StringBuilder comp = new StringBuilder();
        
        char current = str.charAt(0);
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c != current) {
                comp.append(count).append(current);
                current = c;
                count = 0;
            }
            count++;
        }
        // last one
        comp.append(count).append(current);
        
        return comp.toString();
    }
    
    /*
    Using the Java language, have the function PrimeMover(num) return the numth prime number. 
    The range will be from 1 to 10^4. For example: if num is 16 the output should be 53 as 53 is the 16th prime number. 
    */
    public static int primeMover(int num) {
        int index = 1;
        int primes = 0;
        
        while (primes < num) {
            if (primeTime(++index))
                primes++;
        }
        
        return index;
    }
    
    /*
    Using the Java language, have the function PalindromeTwo(str) take the str 
    parameter being passed and return the string true if the parameter is a palindrome, 
    (the string is the same forward as it is backward) otherwise return the string false. 
    The parameter entered may have punctuation and symbols but they should not 
    affect whether the string is in fact a palindrome. 
    For example: "Anne, I vote more cars race Rome-to-Vienna" should return true. 
    */
    public static boolean panlindromeTwo(String str) {
        // remove punctuation, spaces
        str = str.replaceAll("[^a-zA-Z]", "").toLowerCase();
        
        return str.equals(Easy.firstReverse(str));
    }
    
    /*
    Using the Java language, have the function Division(num1,num2) 
    take both parameters being passed and return the Greatest Common Factor. 
    That is, return the greatest number that evenly goes into both numbers 
    with no remainder. For example: 12 and 16 both are divisible by 1, 2, and 4 
    so the output should be 4. The range for both parameters will be from 1 to 10^3. 
    */
    private static Set<Integer> dividers(int num) {
        Set<Integer> dividers = new HashSet<>();
        int index = num;
        
        while (index > 0) {
            if (num % index == 0)
                dividers.add(index);
            index--;
        }
        
        return dividers;
    }
    public static int division(int num1, int num2) {
        Set<Integer> commonDividers = dividers(num1);
        commonDividers.retainAll(dividers(num2));
        
        return Collections.max(commonDividers);
    }
    
    /*
    Using the Java language, have the function StringScramble(str1,str2) take 
    both parameters being passed and return the string true if a portion of 
    str1 characters can be rearranged to match str2, otherwise return the string false. 
    For example: if str1 is "rkqodlw" and str2 is "world" the output should return true. 
    Punctuation and symbols will not be entered with the parameters. 
    */
    public static boolean stringScramble(String a, String b) {
        for (char c : a.toCharArray()) {
            b = b.replaceFirst(String.valueOf(c), "");
        }

        return b.isEmpty();
    }
    
    /*
    Using the Java language, have the function ArithGeoII(arr) take the array of 
    numbers stored in arr and return the string "Arithmetic" if the sequence 
    follows an arithmetic pattern or return "Geometric" if it follows a geometric pattern. 
    If the sequence doesn't follow either pattern return -1. 
    An arithmetic sequence is one where the difference between each of the numbers is consistent, 
    where as in a geometric sequence, each term after the first is multiplied by some constant or common ratio. 
    Arithmetic example: [2, 4, 6, 8] and Geometric example: [2, 6, 18, 54]. 
    Negative numbers may be entered as parameters, 0 will not be entered, and no array will contain all the same elements. 
    */
    private static boolean arithmetic(int[] arr) {
        // check if less than two elements
        if (arr.length < 2)
            return false;
        
        // first difference
        int diff = arr[1] - arr[0];
        
        // other differences
        for (int i = 1; i < arr.length - 1; i++)
            if (arr[i+1] - arr[i] != diff)
                return false;
        
        return true;
    }
    
    private static boolean geometric(int[] arr) {
        // check if only one element
        if (arr.length < 2)
            return false;
        
        // first difference
        int diff = arr[1] / arr[0];
        
        // other differences
        for (int i = 1; i < arr.length - 1; i++)
            if (arr[i+1] / arr[i] != diff)
                return false;
        
        return true;
    }
    
    public static String arithGeoII(int[] arr) {
        if (arithmetic(arr))
            return "Arithmetic";
        else if (geometric(arr))
            return "Geometric";
        else
            return "-1";
    }

    /*
    Using the Java language, have the function LetterCount(str) take the str 
    parameter being passed and return the first word with the greatest number of repeated letters. 
    For example: "Today, is the greatest day ever!" should return greatest because 
    it has 2 e's (and 2 t's) and it comes before ever which also has 2 e's. 
    If there are no words with repeating letters return -1. Words will be separated by spaces. 
    */
    private static int nRepeats(String word) {
        Map<Character, Integer> repeats = new HashMap<>(word.length());
        
        // fill hashmap
        for (char c : word.toCharArray()) {
            if (repeats.containsKey(c))
                repeats.put(c, repeats.get(c) + 1);
            else
                repeats.put(c, 1);
        }
        // return largest value
        return Collections.max(repeats.values());
    }
    
    public static String letterCount(String str) {
        String largest = "-1";
        
        for (String word : str.split(" ")) {
            int repeats = nRepeats(word);
            if (repeats > 1 && repeats > nRepeats(largest))
                largest = word;
        }
        
        return largest;
    }
    
    /*
    Using the Java language, have the function CaesarCipher(str,num) take the 
    str parameter and perform a Caesar Cipher shift on it using the num parameter 
    as the shifting number. A Caesar Cipher works by shifting each letter in the 
    string N places down in the alphabet (in this case N will be num). 
    Punctuation, spaces, and capitalization should remain intact. 
    For example if the string is "Caesar Cipher" and num is 2 the output should be "Ecguct Ekrjgt". 
    */
    public static String caesarCipher(String str, int num) {
        StringBuilder cipher = new StringBuilder();
        
        for (char c : str.toCharArray()) {
            if (Character.isLowerCase(c))
                cipher.append((char)((c - 'a' + num) % ('z'-'a') + 'a'));
            else if (Character.isUpperCase(c))
                cipher.append((char)((c - 'A' + num) % ('Z'-'A') + 'A'));
            else
                cipher.append(c);
        }
        
        return cipher.toString();
    }
    
    /*
    Using the Java language, have the function NumberSearch(str) take the str parameter, 
    search for all the numbers in the string, add them together, 
    then return that final number divided by the total amount of letters in the string. 
    For example: if str is "Hello6 9World 2, Nic8e D7ay!" the output should be 2. 
    First if you add up all the numbers, 6 + 9 + 2 + 8 + 7 you get 32. 
    Then there are 17 letters in the string. 32 / 17 = 1.882, and the final answer 
    should be rounded to the nearest whole number, so the answer is 2. 
    Only single digit numbers separated by spaces will be used throughout the 
    whole string (So this won't ever be the case: hello44444 world). 
    Each string will also have at least one letter. 
    */
    public static int numberSearch(String str) {
        int sum = 0;
        int letters = 0;
        
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c))
                letters++;
            else if (Character.isDigit(c))
                sum += c - '0';
        }
        
        return Math.round((float)sum / letters);
    }
}
