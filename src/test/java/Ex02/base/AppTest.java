package Ex02.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    public void check_output() {
        App myApp = new App();
        String inputString = "Homer";
        int count = 5;
        String expectedOutput = "Homer has 5 characters.";
        String actualOutput = myApp.generateOutput(inputString, count);

        assertEquals(expectedOutput, actualOutput);
    }
}