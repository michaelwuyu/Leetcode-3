package leetcode;

/**
 * Given an array with n integers, your task is to check if it could become non-decreasing by modifying at most 1 element.
 * <p>
 * We define an array is non-decreasing if array[i] <= array[i + 1] holds for every i (1 <= i < n).
 * <p>
 * Example 1:
 * Input: [4,2,3]
 * Output: True
 * Explanation: You could modify the first 4 to 1 to get a non-decreasing array.
 * Example 2:
 * Input: [4,2,1]
 * Output: False
 * Explanation: You can't get a non-decreasing array by modify at most one element.
 * Note: The n belongs to [1, 10,000].
 */
public class NondecreasingArray2 {
    public boolean checkPossibility(int[] nums) {
        int cnt = 0, n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                cnt++;
                // -1,4,2,3 and 3,4,2,5 && not ||
                if ((i - 1 >= 0 && nums[i - 1] > nums[i + 1])
                        && (i + 2 < n && nums[i] > nums[i + 2]))
                    return false;
            }
            if (cnt > 1)
                return false;
        }

        return true;
    }
}
