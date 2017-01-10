import static org.junit.Assert.*;

/**
 * Created by robertcheng on 1/10/17.
 */
public class FirstDupWordsTest {
    @org.junit.Test
    public void firstDupWords() throws Exception {
        FirstDupWords test = new FirstDupWords();
        String[] testCase = {"abc","efg","hij","abc","efg"};
        String res = test.firstDupWords(testCase);
        assertEquals(res, "abc");
    }

}