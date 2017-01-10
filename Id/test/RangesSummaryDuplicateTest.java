import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.*;

/**
 * Created by chengchang on 1/9/17.
 */
public class RangesSummaryDuplicateTest {

    @Test
    public void testRangesSummary() throws Exception {
        RangesSummaryDuplicate test = new RangesSummaryDuplicate();
        int[] testCase1 = {1,2,3,4,6,7,9};
        int[] testCase2 = {2,2,2,3,4,4,6,7,9};
        List<String> res1 = test.rangesSummary(testCase1);
        List<String> compare1 = asList("1->4", "6->7", "9");
        List<String> res2 = test.rangesSummary(testCase2);
        List<String> compare2 = asList("2->4", "6->7", "9");
        assertTrue(compare1.equals(res1));
        assertTrue(compare2.equals(res2));
    }
}