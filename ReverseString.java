import java.io.*;
import java.lang.*;
import java.util.*;
public static int reverseNumber(int num) {
    int reversed = 0;
    int sign = (num < 0) ? -1 : 1; // Save the sign of the number
    num = Math.abs(num); // Work with the absolute value of the number
    
    while (num != 0) {
        int digit = num % 10;
        reversed = reversed * 10 + digit;
        num /= 10;
    }
    
    return reversed * sign; // Restore the sign of the number
}


