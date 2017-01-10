import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by robertcheng on 1/9/17.
 */
public class ReverseStringTest {
    @Test
    public void reverseString() throws Exception {
        ReverseString test = new ReverseString();
        String testCase = "abcd efg hi j k";
        String expectRes = "k j ih gfe dcba";
        assertEquals(test.reverseString(testCase), expectRes);
    }

}