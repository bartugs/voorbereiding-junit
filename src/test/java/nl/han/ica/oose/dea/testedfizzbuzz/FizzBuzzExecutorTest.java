package nl.han.ica.oose.dea.testedfizzbuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzExecutorTest {
    @Test
    void executeWithValidIntTest() {
//        var sut = new FizzBuzzExecutor();
        var testValueOud = sut.execute(37);
        Assertions.assertEquals("37", testValueOud);

        IntStream.range(0, 1001).forEach(number -> {
            var testValue = sut.execute(number);

            if (number % 3 == 0 && number % 5 == 0) {
                Assertions.assertEquals("FizzBuzz", testValue);
            } else if (number % 3 == 0) {
                Assertions.assertEquals("Fizz", testValue);
            } else if (number % 5 == 0) {
                Assertions.assertEquals("Buzz", testValue);
            } else {
                Assertions.assertEquals(String.valueOf(number), testValue); // Als niet deelbaar door 3 of 5
            }
        });

    }
    private FizzBuzzExecutor sut;
    @BeforeEach
    public void setup(){
        sut = new FizzBuzzExecutor();
    }
}