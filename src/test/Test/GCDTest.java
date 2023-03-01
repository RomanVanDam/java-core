package Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

public class GCDTest {

    @Test
    void recursiveMethod_DoNotEquals() {
        int a = 10;
        int b = 15;
        int result = GCD.recursiveMethod(a, b);
        Assertions.assertEquals(5, result);
    }

    @Test
    @Timeout(value = 10, unit = TimeUnit.MILLISECONDS)
    void recursiveMethod_Time() {

    }

    @Test
    void recursiveMethod() {
        int a = 10;
        int b = 15;
        if (b == 0 | a == 0) {
            System.out.println("a или b равно 0");
        } else
            System.out.println("a или b не равно 0");
    }
}