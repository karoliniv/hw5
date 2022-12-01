package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/SQRServiceTest.csv")

    public void shouldCalcNumberOfSquaresInTheRange(int firstBorder, int lastBorder, int expected) {

        SQRService service = new SQRService();

        int actual = service.calculate(firstBorder, lastBorder);

        assertEquals(expected, actual);
    }
}


