import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by robertcheng on 1/9/17.
 */
public class UnionOfTwoSortedArray {
    public List<Integer> getUnionOfTwoSortedArray(int[] arry1, int[] arry2){
        List<Integer> res = new ArrayList<Integer>();
        int i = 0;
        int j = 0;
        while (i < arry1.length && j < arry2.length){
            if (arry1[i] == arry2[j]){
                res.add(arry2[j]);
                i++;
                j++;
            } else if (arry1[i] > arry2[j]){
                res.add(arry2[j]);
                j++;
            } else {
                res.add(arry1[i]);
                i++;
            }
        }

        while (i < arry1.length){
            res.add(arry1[i]);
            i++;
        }

        while (j < arry2.length){
            res.add(arry2[j]);
            j++;
        }
        return res;
    }
}
