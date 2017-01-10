import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by robertcheng on 1/9/17.
 */
public class ReverseHTMLTest {
    @Test
    public void reverseHTML() throws Exception {
        ReverseHTML test = new ReverseHTML();
        String testCase1 = ";aaa;aaa;";
        String testCase2 = "html&lt;123";
        String testCase3 = "html&&lt;;123";
        String res1 = test.reverseHTML(testCase1);
        String res2 = test.reverseHTML(testCase2);
        String res3 = test.reverseHTML(testCase3);
        String expect1 = ";aaa;aaa;";
        String expect2 = "321&lt;lmth";
        String expect3 = "321;&lt;&lmth";
        assertEquals(res1, expect1);
        assertEquals(res2, expect2);
        assertEquals(res3, expect3);
    }

}