package exercises.wordcount;

/**
 * Tests for the WordCounter class.
 */


import java.util.ArrayList;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

/**
 * @author David Matuszek
 * @author KLM
 */
public class WordCounterTest {
    private WordCounter wc;

    /**
     * Makes a list of all the words in a string, where the string consists of
     * lowercase words and spaces <em>only</em>, that is, no punctuation.
     *
     * @param text A string of words separated by spaces only.
     * @return The words in the text string.
     */
    private ArrayList<String> makeList(String text) {
        ArrayList<String> list = new ArrayList<String>();
        String[] array = text.split(" ");
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
        return list;
    }

    private WordCounter makeWordCounter(String stopWords, String text) {
        return new WordCounter(makeList(stopWords), makeList(text));
    }

    @Test
    public void testWordCounter_ArrayListOfString_ArrayListOfString() {
        wc = makeWordCounter("the of", "the one the two two the three three three the");
        assertEquals(1, wc.getRank("three", false));
        assertEquals(2, wc.getRank("two", false));
        assertEquals(3, wc.getRank("one", false));

        assertEquals(1, wc.getRank("the", true));
        assertEquals(2, wc.getRank("three", true));
        assertEquals(3, wc.getRank("two", true));
        assertEquals(4, wc.getRank("one", true));
    }

    @Test
    public void testGetWord() {
        wc = makeWordCounter("the of", "the one the two two the three three three the");
        assertEquals("three", wc.getWord(1, false));
        assertEquals("two", wc.getWord(2, false));
        assertEquals("one", wc.getWord(3, false));

        assertEquals("the", wc.getWord(1, true));
        assertEquals("one", wc.getWord(4, true));
    }

    @Test
    public void testGetWordCount() {
        wc = makeWordCounter("the of", "the one the two two the three three three the");
        assertEquals(3, wc.getWordCount());
    }

    @Test
    public void testGetRank() {
        wc = makeWordCounter("the of", "the one the two two the three three three the");

        assertEquals(3, wc.getRank("one", false));
        assertEquals(2, wc.getRank("two", false));
        assertEquals(1, wc.getRank("three", false));
        assertEquals(0, wc.getRank("sassafras", false));

        assertEquals(1, wc.getRank("the", true));
        assertEquals(2, wc.getRank("three", true));
        assertEquals(3, wc.getRank("two", true));
        assertEquals(4, wc.getRank("one", true));
        assertEquals(0, wc.getRank("sassafras", true));
    }

    @Test
    public void testGetWordsWithApostrophe() {
        wc = makeWordCounter("the of", "can't we can't");
        assertEquals("can't", wc.getWord(1, true));
        assertEquals("we", wc.getWord(2, false));
    }

    @Test
    public void testGetWordsWithUnicodeLetters() {
        wc = makeWordCounter("", "pie \u00E0 la mode b\u00EAte noire");
        assertEquals(6, wc.getWordCount());
        assertTrue(wc.getRank("pie", true) > 0);
        assertTrue(wc.getRank("b\u00EAte", true) > 0);
    }
}