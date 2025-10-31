package it.fav.mvn;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void testAbbreviateMessage() {
        String message = "Hello, Maven! This is a longer message to demonstrate abbreviation.";
        String expected = "Hello, Maven! Thi...";
        assertEquals(expected, Main.abbreviateMessage(message, 20));
    }
}