package com.angrygrizley.rsoi_lab1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;
import static org.springframework.test.util.AssertionErrors.assertEquals;

@RunWith(SpringRunner.class)
public class UnitTest {

    @Test
    public void testReverseString() {
        assertEquals("Test error", StringWorker.getReverseString("1"), "1");
        assertEquals("Test error", StringWorker.getReverseString("123"), "321");
        assertEquals("Test error", StringWorker.getReverseString(""), "");
        assertEquals("Test error", StringWorker.getReverseString("111"), "111");
    }
}
