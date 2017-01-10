import java.util.ArrayList;
import java.util.List;

/**
 * Created by chengchang on 1/9/17.
 */

// 1,2,2,2,3,4,6,7,9 -> [1->4, 6->7, 9]
public class RangesSummaryDuplicate {
    public List<String> rangesSummary(int[] nums){
        List<String> res = new ArrayList<String >();
        if (nums.length < 2){
            res.add(nums[0]+"");
            return res;
        }
        for (int i = 0; i < nums.length; i++){
            int a = nums[i];
            while ((i+1 < nums.length && nums[i+1] - nums[i] == 1) || (i+1 < nums.length && nums[i+1] - nums[i] == 0)){
                i++;
            }
            if (a != nums[i]){
                res.add(a + "->" + nums[i]);
            } else {
                res.add(a + "");
            }
        }

        return res;
    }
}
