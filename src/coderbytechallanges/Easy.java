package coderbytechallanges;

/**
 *
 * @author matej
 */
public class Easy {
    
    /*
    Using the Java language, have the function FirstReverse(str) take the str parameter being passed and return the string in reversed order. 
    */
    public static String firstReverse(String str) {
        StringBuilder reversed = new StringBuilder();
        
        for (int i = str.length()-1; i >= 0; i--)
            reversed.append(str.charAt(i));
        
        return reversed.toString();
    }
}
