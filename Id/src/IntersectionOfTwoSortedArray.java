/**
 * Created by robertcheng on 1/9/17.
 */

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfTwoSortedArray {
    public List<Integer> getIntersectionOfTwoSortedArray(int[] arry1, int[] arry2){
        List<Integer> res = new ArrayList<Integer>();
        int i = 0;
        int j = 0;
        while (i < arry1.length && j < arry2.length){
            if (arry1[i] == arry2[j]){
                res.add(arry1[i]);
                i++;
                j++;
            } else if (arry1[i] > arry2[j]){
                j++;
            } else {
                i++;
            }
        }
        return res;
    }

}
