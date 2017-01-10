import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;

/**
 * Created by chengchang on 1/9/17.
 */

import static java.util.Arrays.asList;

public class RangesSummaryListTest {

    @Test
    public void testRangesSummary() throws Exception {
        RangesSummaryList test = new RangesSummaryList();
        int[] testCase = {1,2,3,4,6,7,9};
        List<String> res = test.rangesSummary(testCase);
        List<String> compare = asList("1->4", "6->7", "9");
        assertTrue(compare.equals(res));
    }
}