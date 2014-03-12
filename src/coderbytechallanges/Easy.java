package coderbytechallanges;

import java.util.Arrays;

/**
 *
 * @author matej
 */
public class Easy {
    
    /*
    Helper methods
    */
    private static boolean isLowercase(char c) {
        return c >= 'a' && c <= 'z';
    }
    
    private static boolean isUppercase(char c) {
        return c >= 'A' && c <= 'Z';
    }
    
    private static boolean isLetter(char c) {
        return isLowercase(c) || isUppercase(c);
    }
    
    /*
    Using the Java language, have the function FirstReverse(str) 
    take the str parameter being passed and return the string in reversed order. 
    */
    public static String firstReverse(String str) {
        StringBuilder reversed = new StringBuilder();
        
        for (int i = str.length()-1; i >= 0; i--)
            reversed.append(str.charAt(i));
        
        return reversed.toString();
    }
    
    /*
    Using the Java language, have the function FirstFactorial(num) take the num 
    parameter being passed and return the factorial of it (ie. if num = 4, 
    return (4 * 3 * 2 * 1)). For the test cases, the range will be between 1 and 18. 
    */
    public static int firstFactorial(int num) {
        int fact = 1;
        
        while (num > 0)
            fact *= num--;
        
        return fact;
    }
    
    /*
    Using the Java language, have the function LongestWord(sen) take the sen 
    parameter being passed and return the largest word in the string. 
    If there are two or more words that are the same length, return the 
    first word from the string with that length. Ignore punctuation and assume sen will not be empty. 
    */
    public static String longestWord(String sen) {
        String longest = "";
        
        for (String s : sen.split("[^a-zA-Z]"))
            if (s.length() > longest.length())
                longest = s;
        
        return longest;
    }
    
    /*
    Using the Java language, have the function LetterChanges(str) take the str 
    parameter being passed and modify it using the following algorithm. 
    Replace every letter in the string with the letter following it in the alphabet 
    (ie. c becomes d, z becomes a). Then capitalize every vowel in this new string 
    (a, e, i, o, u) and finally return this modified string. 
    */
    public static String letterChanges(String str) {
        StringBuilder shifted = new StringBuilder();
        
        for (char c : str.toCharArray()) {
            if (isLowercase(c)) {
                // shifting
                char newChar = (char)((c - 'a' + 1) % ('z'-'a') + 'a');
                // uppercase
                switch (newChar) {
                    case 'a': case 'e': case 'i': case 'o': case 'u': 
                        newChar -= 'a' - 'A'; 
                        break;
                }
                shifted.append(newChar);
            } else {
                shifted.append(c);
            }
        }
        
        
        return shifted.toString();
    }
    
    /*
    Using the Java language, have the function SimpleAdding(num) add up all the 
    numbers from 1 to num. For the test cases, the parameter num will be any number from 1 to 1000. 
    */
    public static int simpleAdding(int num) {
        int sum = 0;
        
        for (int i = 1; i <= num; i++)
            sum += i;
        
        return sum;
    }
    
    /*
    Using the Java language, have the function LetterCapitalize(str) take the 
    str parameter being passed and capitalize the first letter of each word. 
    Words will be separated by only one space. 
    */
    public static String letterCapitalize(String str) {
        StringBuilder caps = new StringBuilder();
        
        for (String s : str.split(" ")) {
            char first = s.charAt(0);
            
            if (isLowercase(first))
                caps.append(s.replace(first, (char)(first - 'a' + 'A')));
            else
                caps.append(s);
            caps.append(" ");
        }
        
        return caps.toString().trim();
    }
    
    /*
    Using the Java language, have the function SimpleSymbols(str) 
    take the str parameter being passed and determine if it is an 
    acceptable sequence by either returning the string true or false. 
    The str parameter will be composed of + and = symbols with several 
    letters between them (ie. ++d+===+c++==a) and for the string to be true each 
    letter must be surrounded by a + symbol. So the string to the left would be false. 
    The string will not be empty and will have at least one letter. 
    */
    public static boolean simpleSymbols(String str) {
        // edge cases
        if (isLetter(str.charAt(0)) || isLetter(str.charAt(str.length()-1)))
            return false;
        
        // middle cases
        for (int i = 1; i < str.length()-1; i++)
            if (isLetter(str.charAt(i)) && (str.charAt(i-1) != '+' || str.charAt(i+1) != '+'))
                return false;
        
        return true;
    }
    
    /*
    Using the Java language, have the function CheckNums(num1,num2) take 
    both parameters being passed and return the string true if num2 is greater 
    than num1, otherwise return the string false. 
    If the parameter values are equal to each other then return the string -1.
    */
    public static String checkNums(int a, int b) {
        if (a < b)
            return "true";
        else if (a > b)
            return "false";
        else return "-1";
    }
    
    /*
    Using the Java language, have the function TimeConvert(num) take the num 
    parameter being passed and return the number of hours and minutes the parameter 
    converts to (ie. if num = 63 then the output should be 1:3). 
    Separate the number of hours and minutes with a colon. 
    */
    public static String timeConvert(int n) {
        return String.format("%d:%d", n / 60, n % 60);
    }
    
    /*
    Using the Java language, have the function AlphabetSoup(str) take the str 
    string parameter being passed and return the string with the letters in 
    alphabetical order (ie. hello becomes ehllo). 
    Assume numbers and punctuation symbols will not be included in the string. 
    */
    public static String alphabetSoup(String str) {
        char[] letters = str.toCharArray();
        Arrays.sort(letters);
        
        return String.valueOf(letters);
    }
}
