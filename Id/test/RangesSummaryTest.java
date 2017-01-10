import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by chengchang on 1/9/17.
 */
public class RangesSummaryTest {
    @Test
    public void testSummaryRanges() throws Exception {
        RangesSummary test = new RangesSummary();
        int[] testCase = {1,2,3,4,6,7,9};
        assertEquals("1->4,6->7,9", test.summaryRanges(testCase));
    }
}