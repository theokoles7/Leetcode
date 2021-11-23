import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args){
        int[] nums1 = {2, 7, 11, 15};                       // Example Array 1 from LeetCode
        int[] nums2 = {3, 2, 4};                            // Example Array 2 from LeetCode
        int[] nums3 = {3, 3};                               // Example Array 3 from LeetCode

        int target1 = 9;                                    // Example Target 1 from LeetCode
        int target2 = 6;                                    // Example Target 2 from LeetCode
        int target3 = 6;                                    // Example Target 3 from LeetCode

        System.out.println("Example 1: " 
        + twoSum(nums1, target1));                          // Run of Example 1
        System.out.println("Example 2: " 
        + twoSum(nums2, target2));                          // Run of Example 2
        System.out.println("Example 3: " 
        + twoSum(nums3, target3));                          // Run of Example 3
    }

    public static String twoSum(int[] nums, int target){
        int[] result = new int[2];                          // Initialize array to be returned with output

        for(int i = 0; i < nums.length; i++){               // Parse nums for first number to be added
            for(int j = i + 1; j < nums.length; j++){       // Parse nums for second number to be added
                if(nums[i] + nums[j] == target){            // Check their sum; If it equals the target
                    result[0] = i;                          // Record first index
                    result[1] = j;                          // Record second index
                }
            }
        }
        return Arrays.toString(result);                     // Return string conversion of array
    }
}
