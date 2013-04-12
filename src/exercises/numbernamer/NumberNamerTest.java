package exercises.numbernamer;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class NumberNamerTest {
    private NumberNamer namer;

    @Before
    public void setUp() throws Exception {
        namer = new NumberNamer();
    }

    @Test
    public final void testNameOfDigitZero() {
        assertEquals("zero", namer.nameOf(0));
    }

    @Test
    public final void testNameOfDigit() {
        assertEquals("one", namer.nameOf(1));
        assertEquals("two", namer.nameOf(2));
        assertEquals("three", namer.nameOf(3));
        assertEquals("four", namer.nameOf(4));
        assertEquals("five", namer.nameOf(5));
        assertEquals("six", namer.nameOf(6));
        assertEquals("seven", namer.nameOf(7));
        assertEquals("eight", namer.nameOf(8));
        assertEquals("nine", namer.nameOf(9));
    }

    @Test
    public final void testNameOfTeens() {
        assertEquals("eleven", namer.nameOf(11));
        assertEquals("twelve", namer.nameOf(12));
        assertEquals("thirteen", namer.nameOf(13));
        assertEquals("fourteen", namer.nameOf(14));
        assertEquals("fifteen", namer.nameOf(15));
        assertEquals("sixteen", namer.nameOf(16));
        assertEquals("seventeen", namer.nameOf(17));
        assertEquals("eighteen", namer.nameOf(18));
        assertEquals("nineteen", namer.nameOf(19));
    }

    @Test
    public final void testNameOfTensDigit() {
        assertEquals("ten", namer.nameOf(10));
        assertEquals("twenty", namer.nameOf(20));
        assertEquals("thirty", namer.nameOf(30));
        assertEquals("forty", namer.nameOf(40));
        assertEquals("fifty", namer.nameOf(50));
        assertEquals("sixty", namer.nameOf(60));
        assertEquals("seventy", namer.nameOf(70));
        assertEquals("eighty", namer.nameOf(80));
        assertEquals("ninety", namer.nameOf(90));
    }

    @Test
    public final void testNameOfHundreds() {
        assertEquals("one hundred", namer.nameOf(100));
        assertEquals("two hundred", namer.nameOf(200));
        assertEquals("three hundred", namer.nameOf(300));
        assertEquals("four hundred", namer.nameOf(400));
        assertEquals("five hundred", namer.nameOf(500));
        assertEquals("six hundred", namer.nameOf(600));
        assertEquals("seven hundred", namer.nameOf(700));
        assertEquals("eight hundred", namer.nameOf(800));
        assertEquals("nine hundred", namer.nameOf(900));
    }

    @Test
    public final void testNameOfThousands() {
        assertEquals("one thousand", namer.nameOf(1000));
        assertEquals("two thousand", namer.nameOf(2000));
        assertEquals("three thousand", namer.nameOf(3000));
        assertEquals("four thousand", namer.nameOf(4000));
        assertEquals("five thousand", namer.nameOf(5000));
        assertEquals("six thousand", namer.nameOf(6000));
        assertEquals("seven thousand", namer.nameOf(7000));
        assertEquals("eight thousand", namer.nameOf(8000));
        assertEquals("nine thousand", namer.nameOf(9000));
    }

    @Test
    public final void testNameOfAssortedNumbers() {
        assertEquals("twenty three", namer.nameOf(23));
        assertEquals("ninety nine", namer.nameOf(99));

        assertEquals("two hundred ten", namer.nameOf(210));
        assertEquals("four hundred one", namer.nameOf(401));
        assertEquals("six hundred seventeen", namer.nameOf(617));
        assertEquals("seven hundred forty three", namer.nameOf(743));
        assertEquals("eight hundred sixty one", namer.nameOf(861));
        assertEquals("nine hundred six", namer.nameOf(906));

        assertEquals("one thousand", namer.nameOf(1000));
        assertEquals("two thousand one", namer.nameOf(2001));
        assertEquals("three thousand ten", namer.nameOf(3010));
        assertEquals("four thousand nineteen", namer.nameOf(4019));
        assertEquals("five thousand one hundred", namer.nameOf(5100));
        assertEquals("six thousand one hundred six", namer.nameOf(6106));
        assertEquals("seven thousand one hundred twenty", namer.nameOf(7120));
        assertEquals("eight thousand eleven", namer.nameOf(8011));
        assertEquals("nine thousand nine hundred ninety nine", namer.nameOf(9999));
    }

    @Test
    public final void testNameOfAssortedTrimmedNumbers() {
        assertTrimmedEquals("twenty three", namer.nameOf(23));
        assertTrimmedEquals("ninety nine", namer.nameOf(99));

        assertTrimmedEquals("two hundred ten", namer.nameOf(210));
        assertTrimmedEquals("four hundred one", namer.nameOf(401));
        assertTrimmedEquals("six hundred seventeen", namer.nameOf(617));
        assertTrimmedEquals("seven hundred forty three", namer.nameOf(743));
        assertTrimmedEquals("eight hundred sixty one", namer.nameOf(861));
        assertTrimmedEquals("nine hundred six", namer.nameOf(906));

        assertTrimmedEquals("one thousand", namer.nameOf(1000));
        assertTrimmedEquals("two thousand one", namer.nameOf(2001));
        assertTrimmedEquals("three thousand ten", namer.nameOf(3010));
        assertTrimmedEquals("four thousand nineteen", namer.nameOf(4019));
        assertTrimmedEquals("five thousand one hundred", namer.nameOf(5100));
        assertTrimmedEquals("six thousand one hundred six", namer.nameOf(6106));
        assertTrimmedEquals("seven thousand one hundred twenty", namer.nameOf(7120));
        assertTrimmedEquals("eight thousand eleven", namer.nameOf(8011));
        assertTrimmedEquals("nine thousand nine hundred ninety nine", namer.nameOf(9999));
    }

    private void assertTrimmedEquals(String expected, String actual) {
        assertEquals(expected, actual.trim());
    }
}