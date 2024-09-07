package Tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;


public class test1 {
    public String reverse(String input) {
        if (input == null) {
            return null;  // Handle null input
        }
        return new StringBuilder(input).reverse().toString();
    }
    
    @Test
    public void testReverseRegularString() {
        String result = reverse("Hello");
        assertEquals("olleH", result); // Expected output is "olleH"
    }

    @Test
    public void testReverseEmptyString() {
        String result = reverse("");
        assertEquals("", result); // Expected output is an empty string
    }

    @Test
    public void testReverseNullString() {
        String result = reverse(null);
        assertNull(result); // Expected output is null
    }

    @Test
    public void testReversePalindromeString() {
        String result =reverse("madam");
        assertEquals("madam", result); // Expected output is "madam" (same as input because it's a palindrome)
    }
}


