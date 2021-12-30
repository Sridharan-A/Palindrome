package org.palindrome;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class AssertionTest {

    AssertionTest a, b, c;

    @Before
    public void initialSetup() {
        a = new AssertionTest();
        b = new AssertionTest();
    }

    @Test
    public void arrayEqualsFunction(){
        byte b1[] = "abc".getBytes();
        byte b2[] = "abc".getBytes();

        int a[] = {1, 2, 3};
        int b[] = {1, 2, 3};
        assertArrayEquals("failure when not same", a, b);
    }
    @Test
    public void assertEqualsFunction(){
        assertEquals("Failure - text are not equal", "text1", "text1");
    }
    @Test
    public void assertFalseFunction(){
        assertFalse("Failure if condition true", false);
    }
    @Test
    public void assertNotNullFuncton(){
        assertNotNull("should not be null", a);
    }
    @Test
    public void assertNotSameFunction(){
        assertNotSame("Should not be same object", a, b);
    }
    @Test
    public void assertNullFuncton(){
        assertNull("Should be null", c);
    }
    @Test
    public void assertSameFunction(){
        String s1 = "abc";
        String s2 = "abc";
        assertSame("Same", s1, s2);
    }
    @Test
    public void assertThatcontainsStringFunction(){
        assertThat("one", both(containsString("o")).and(containsString("e")));
    }
    @Test
    public void assertThatHasItemFunction(){
        assertThat(Arrays.asList("sri", "hari", "krithik"), hasItems("sri", "hari"));
    }
    @Test
    public void assertThatEveryItemFunction(){
        assertThat(Arrays.asList(new String[]{"sri", "hari", "krithik"}), everyItem(containsString("i")));
    }















}
