import java.io.*;
import java.lang.*;
import java.util.*;
public class ReverseString {
    public static void main(String[] args) {
        String original = "Hello, World!";
        StringBuilder reversed = new StringBuilder(original);
        System.out.println("Reversed string: " + reversed.reverse().toString());
    }
}



