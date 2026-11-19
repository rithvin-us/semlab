package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PassFailTest {

    @Test
    void marks35ShouldFail() {
        assertEquals("FAIL", PassFail.getResult(35));
    }

    @Test
    void marks50ShouldPass() {
        assertEquals("PASS", PassFail.getResult(50));
    }

    @Test
    void marks75ShouldPass() {
        assertEquals("PASS", PassFail.getResult(75));
    }

    @Test
    void marks100ShouldPass() {
        assertEquals("PASS", PassFail.getResult(100));
    }
}
