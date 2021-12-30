package org.palindrome;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.security.InvalidParameterException;

import static org.junit.Assert.assertThrows;

public class PalindromeTest {
    Palindrome p;

    @Before
    public void initialSetUp() {
        p = new Palindrome();
    }

    @Test
    public void testIsPalindromeReturnInvalidParameterExceptionForInputLessThanZero() {
        InvalidParameterException thrown = assertThrows(InvalidParameterException.class, () -> p.isPalindrome(-234));
        Assert.assertEquals("Input less than 0", thrown.getMessage());
    }

    @Test(expected = InvalidParameterException.class)
    public void testIsPalindromeReturnExceptionForInputLessThanZero() {
        p.isPalindrome(-5);
    }

    @Test
    public void testIsPalindromeReturnTrueWhen23432IsGivenInput() {
        Assert.assertEquals(true, p.isPalindrome(234565432));
    }

    @Test
    public void testIsPalindromeReturnTrueWhen0IsGivenInput() {
        Assert.assertEquals(true, p.isPalindrome(0));
    }


    @Test
    public void testIsPalindromeReturnFalseWhen23IsGivenInput() {
        Assert.assertEquals(false, p.isPalindrome(2345654));
    }


}
