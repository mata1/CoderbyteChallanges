package coderbytechallanges;

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
}
