/**
 * Created by robertcheng on 1/10/17.
 */
public class FindLocalMinium {
    // O(n)
    public int findLocalMin(int[] nums){
        for (int i  = 1; i < nums.length; i++){
            if (nums[i] < nums[i-1] && nums[i] < nums[i+1]) return nums[i];
        }
        return (nums[0] < nums[nums.length - 1]) ? nums[0]:nums[nums.length - 1];
    }

    //O(lgn)
    public int findLocalMin(int[] nums){
        return helper(nums, 0, nums.length - 1;
    }

    public int helper (int[] nums, int start, int end){
        if (start == end){
            return start;
        } else if (start + 1 == end){
            if (nums[start] < nums[end]) return start;
            return end;
        } else {
            int m = start + (end - start) / 2;
            if (nums[m] < nums[m+1] && nums[m] < nums[m-1]){
                return m;
            } else if (nums[m+1] > nums[m] && nums[m-1] < nums[m]) {
                return helper(nums, start, m - 1);
            } else (nums[m+1] > nums[m] && nums[m-1] < nums[m]){
                return helper(nums, start, m-1);
            } else {
                return helper(nums, m+1, end);
            }
        }
    }
}
