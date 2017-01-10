/**
 * Created by chengchang on 1/8/17.
 */

public class RangesSummary {
    public String summaryRanges(int[] nums){
        StringBuilder sb = new StringBuilder();

        if (nums == null || nums.length == 0) {
            return sb.toString();
        }

        for (int i = 0; i < nums.length; i++){
            int a = nums[i];
            while (1 + i < nums.length && nums[i + 1] == nums[i] + 1){
                i++;
            }

            if (a != nums[i]){
                sb.append(a + "->" + nums[i] + ",");
            } else {
                sb.append(a + ",");
            }
        }
        String res = sb.toString();
        return res.substring(0, res.length() - 1);
    }
}
