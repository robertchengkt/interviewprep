import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by robertcheng on 1/9/17.
 */
public class IntersectionOfTwoSortedArrayTest {
    @Test
    public void getIntersectionOfTwoSortedArray() throws Exception {
        IntersectionOfTwoSortedArray test = new IntersectionOfTwoSortedArray();
        int[] test1Arry1 = {1,2,3,4,6,8,9,12};
        int[] test1Arry2 = {1,2,8,12,13,14};
        int[] test2Arry1 = {};
        int[] test2Arry2 = {1,2,8,12};

        List<Integer> runRes1 = test.getIntersectionOfTwoSortedArray(test1Arry1, test1Arry2);
        List<Integer> runRes2 = test.getIntersectionOfTwoSortedArray(test2Arry1, test2Arry2);
        List<Integer> res1 = new ArrayList<>(Arrays.asList(1,2,8,12));
        List<Integer> res2 = new ArrayList<>();
        assertEquals(runRes1,res1);
        assertEquals(runRes2,res2);
    }

}