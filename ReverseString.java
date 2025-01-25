import java.io.*;
import java.lang.*;
import java.util.*;
public class ReverseString {

    public static void main(String[] args) {
        String input = "hello"; 
        String reversed = reverseString(input);
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reversed);
    }
    public static String reverseString(String str) {
        StringBuilder reversedString = new StringBuilder(str);
        return reversedString.reverse().toString();
    }

